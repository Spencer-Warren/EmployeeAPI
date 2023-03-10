package com.employee.service;

import com.employee.entity.Boss;

import java.util.List;

public interface BossService {

    List<Boss> getBoss();

    Boss getBoss(Long id);

    Boss addBoss(Boss employee);

    Boss updateBoss(Boss employee);

    String deleteBoss(Long id);
}
