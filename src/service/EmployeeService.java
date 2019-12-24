package service;

import dao.EmployeeDao;
import model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

  private EmployeeDao employeeDao = new EmployeeDao();

  public List<Employee> getAdultEmployees() {
    return getAllEmployees().stream()
        .filter(Employee::isAdult)
        .sorted(Comparator.comparing(Employee::getName).reversed())
        .peek(employee -> employee.setName(employee.getName().toUpperCase()))
        .collect(Collectors.toList());
  }

  private List<Employee> getAllEmployees() {
    return employeeDao.getAllEmployees();
  }

}
