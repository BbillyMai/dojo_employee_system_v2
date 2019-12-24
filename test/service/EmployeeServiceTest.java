package service;

import model.Employee;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeServiceTest {

  @Test
  public void should_return_adult_employees_when_invoke_getAdultEmployees() {
    EmployeeService employeeService = new EmployeeService();
    List<Employee> adultEmployees = employeeService.getAdultEmployees();

    assertEquals(2, adultEmployees.size());
    assertTrue(adultEmployees.get(0).getAge() >= 18);
    assertTrue(adultEmployees.get(1).getAge() >= 18);
  }

  @Test
  public void should_return_adult_employees_sorted_by_name_when_invoke_getAdultEmployees() {
    EmployeeService employeeService = new EmployeeService();
    List<Employee> adultEmployees = employeeService.getAdultEmployees();

    assertEquals("Mike", adultEmployees.get(0).getName());
    assertEquals("Sepp", adultEmployees.get(1).getName());
  }

  @Test
  public void should_return_adult_employees_name_is_capitalized_when_invoke_getAdultEmployees() {
    EmployeeService employeeService = new EmployeeService();
    List<Employee> adultEmployees = employeeService.getAdultEmployees();

    assertEquals("MIKE", adultEmployees.get(0).getName());
    assertEquals("SEPP", adultEmployees.get(1).getName());
  }
}