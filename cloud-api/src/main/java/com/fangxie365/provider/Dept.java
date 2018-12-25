package com.fangxie365.provider;


import java.io.Serializable;

public class Dept implements Serializable// entity --orm--- db_table
{
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept() {
    }

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }



    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dept dept = (Dept) o;

        if (deptno != null ? !deptno.equals(dept.deptno) : dept.deptno != null) return false;
        if (dname != null ? !dname.equals(dept.dname) : dept.dname != null) return false;
        return db_source != null ? db_source.equals(dept.db_source) : dept.db_source == null;
    }

    @Override
    public int hashCode() {
        int result = deptno != null ? deptno.hashCode() : 0;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (db_source != null ? db_source.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
