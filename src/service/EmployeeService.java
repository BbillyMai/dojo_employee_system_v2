package service;

import dao.EmployeeDao;
import model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

  public List<Employee> getAdultEmployees() {
    EmployeeDao employeeDao = new EmployeeDao();
    List<Employee> allEmployees = employeeDao.getAllEmployees();
    List<Employee> adultEmployees = allEmployees.stream()
        .filter(employee -> employee.getAge() >= 18).collect(Collectors.toList());
    return adultEmployees;
  }
}
