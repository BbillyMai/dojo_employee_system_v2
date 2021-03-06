package service;

import model.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeServiceTest {

  private EmployeeService employeeService;

  @Before
  public void setUp() throws Exception {
    employeeService = new EmployeeService();
  }

  @Test
  public void should_return_adult_employees_when_invoke_getAdultEmployees() {
    List<Employee> adultEmployees = employeeService.getAdultEmployees();

    assertEquals(2, adultEmployees.size());
    assertTrue(adultEmployees.get(0).isAdult());
    assertTrue(adultEmployees.get(1).isAdult());
  }

  @Test
  public void should_return_adult_employees_sorted_by_name_desc_when_invoke_getAdultEmployees() {
    List<Employee> adultEmployees = employeeService.getAdultEmployees();

    String firstEmployeeName = adultEmployees.get(0).getName();
    String secondEmployeeName = adultEmployees.get(1).getName();
    boolean isNameSortDesc = firstEmployeeName.compareTo(secondEmployeeName) > 0;
    assertTrue(isNameSortDesc);
  }

  @Test
  public void should_return_adult_employees_name_is_capitalized_when_invoke_getAdultEmployees() {
    List<Employee> adultEmployees = employeeService.getAdultEmployees();

    assertTrue(adultEmployees.get(0).getName().matches("[A-Z]+"));
    assertTrue(adultEmployees.get(1).getName().matches("[A-Z]+"));
  }
}