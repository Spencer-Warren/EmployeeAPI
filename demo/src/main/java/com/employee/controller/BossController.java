package com.employee.controller;

import com.employee.entity.Boss;
import com.employee.service.BossService;
import com.employee.service.BossServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BossController {

    @Autowired
    private BossService service;

    @GetMapping("/boss")
    public List<Boss> getboss() {
        return service.getBoss();
    }

    @GetMapping("/boss/{id}")
    public Boss getBossById(@PathVariable Long id) {
        return service.getBoss(id);
    }

    @PostMapping("/boss")
    public Boss addBoss(@RequestBody Boss Boss) {
        return service.addBoss(Boss);
    }

    @PutMapping("/boss")
    public Boss updateBoss(@RequestBody Boss Boss) {
        return service.updateBoss(Boss);
    }

    @DeleteMapping("/boss/{id}")
    public String deleteBoss(@PathVariable Long id) {
        return service.deleteBoss(id);
    }
}
