package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl service;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return service.getEmployee(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return service.deleteEmployee(id);
    }

    @PostMapping("/employees/{id}/boss/{bossId}")
    public Employee updateEmployeeBoss(@PathVariable Long id, @PathVariable Long bossId) {
        return service.updateEmployeeBoss(id, bossId);
    }

    @GetMapping("/employees/{id}/boss")
    public Employee getEmployeeBoss(@PathVariable Long id) {
        return service.getEmployeeBoss(id);
    }

    @DeleteMapping("/employees/{id}/boss")
    public String deleteEmployeeBoss(@PathVariable Long id) {
        return service.deleteEmployeeBoss(id);
    }


}
