package com.employee.service;

import com.employee.dao.BossDao;
import com.employee.entity.Boss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BossServiceImpl implements BossService {
    @Autowired
    private BossDao bossDao;

    @Override
    public List<Boss> getBoss() {
        return bossDao.findAll();
    }

    @Override
    public Boss getBoss(Long id) {
        return bossDao.getReferenceById(id);
    }

    @Override
    public Boss addBoss(Boss boss) {
        return bossDao.save(boss);
    }

    @Override
    public Boss updateBoss(Boss boss) {
        return bossDao.save(boss);
    }

    @Override
    public String deleteBoss(Long id) {
        bossDao.deleteById(id);
        return "Boss deleted with id: " + id;
    }
}
