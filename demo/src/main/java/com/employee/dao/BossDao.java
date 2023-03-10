package com.employee.dao;

import com.employee.entity.Boss;
import com.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BossDao extends JpaRepository<Boss, Long> {
}
