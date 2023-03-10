package com.employee.service;

import com.employee.dao.BossDao;
import com.employee.dao.EmployeeDao;
import com.employee.entity.Boss;
import com.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private BossDao bossDao;

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeDao.findById(id).orElse(null);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeDao.deleteById(id);
        return "Successfully deleted";
    }

    @Override
    public Employee updateEmployeeBoss(Long id, Long bossId) {
        return employeeDao.getReferenceById(id).setBossId(bossId);
    }

    @Override
    public Boss getEmployeeBoss(Long id) {
        Long bossId = employeeDao.getReferenceById(id).getBossId();
        if (Objects.isNull(bossId) || bossId == -1L) {
            return new Boss("No boss", "No boss", "No boss", "No boss");
        }
        return bossDao.getReferenceById(bossId);
    }

    @Override
    public String deleteEmployeeBoss(Long id) {
        employeeDao.getReferenceById(id).setBossId(-1L);
        return "Successfully deleted";
    }
}
