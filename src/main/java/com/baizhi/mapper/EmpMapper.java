package com.baizhi.mapper;

import com.baizhi.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmpMapper {
    public List<Emp> queryAll();

    public void addEmp(@Param("emp") Emp emp);

    public void updateEmp(Emp emp);

    public void deleteEmp(Integer id);
}
