package com.employee.service;

import com.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee getEmployee(Long id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public String deleteEmployee(Long id);

    Employee updateEmployeeBoss(Long id, Long bossId);

    Employee getEmployeeBoss(Long id);

    String deleteEmployeeBoss(Long id);
}
