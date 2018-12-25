package com.fangxie365.provider.dao;

import com.fangxie365.provider.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeptDao {
    /**
     * 部门服务,查询
     * @param deptno
     * @return
     */
    public Dept findById(@Param("deptno")Long deptno);
}
