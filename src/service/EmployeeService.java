package service;

import dao.EmployeeDao;
import model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

  public List<Employee> getAdultEmployees() {
    EmployeeDao employeeDao = new EmployeeDao();
    List<Employee> allEmployees = employeeDao.getAllEmployees();
    List<Employee> adultEmployees = allEmployees.stream()
        .filter(Employee::isAdult)
        .sorted(Comparator.comparing(Employee::getName).reversed())
        .peek(employee -> employee.setName(employee.getName().toUpperCase()))
        .collect(Collectors.toList());
    return adultEmployees;
  }
}
