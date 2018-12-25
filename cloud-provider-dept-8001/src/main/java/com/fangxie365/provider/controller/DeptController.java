package com.fangxie365.provider.controller;

import com.fangxie365.provider.Dept;
import com.fangxie365.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptService.findById(id);
    }
}
