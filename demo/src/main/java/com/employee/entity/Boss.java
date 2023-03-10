package com.employee.entity;

import jakarta.persistence.Entity;

@Entity
public class Boss extends Employee{
    private String department;

    public Boss() {
    }

    public Boss(String name, String email, String jobTitle, String department) {
        super(name, email, jobTitle);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
