package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> getAll();

    public void addEmp(Emp emp);

    public void changeEmpMessage(Emp emp);

    public void dropEmp(Integer id);
}
