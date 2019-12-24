package dao;

import java.util.Arrays;
import java.util.List;
import model.Employee;

public class EmployeeDao {

  public List<Employee> getAllEmployees() {
    Employee employee1 = new Employee("Max", 17);
    Employee employee2 = new Employee("Sepp", 18);
    Employee employee3 = new Employee("Nina", 15);
    Employee employee4 = new Employee("Mike", 51);

    Employee[] employees = {employee1, employee2, employee3, employee4};

    return Arrays.asList(employees);
  }
}
