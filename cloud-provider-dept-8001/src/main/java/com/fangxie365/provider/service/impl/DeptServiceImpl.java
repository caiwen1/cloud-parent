package com.fangxie365.provider.service.impl;

import com.fangxie365.provider.Dept;
import com.fangxie365.provider.dao.DeptDao;
import com.fangxie365.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public Dept findById(Long deptno) {
        return deptDao.findById(deptno);
    }
}
