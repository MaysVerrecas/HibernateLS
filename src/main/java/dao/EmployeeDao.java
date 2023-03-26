package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee createEmployee(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();

    Employee updateEmployee(Employee employee);

    Employee delete(Employee employee);
}
