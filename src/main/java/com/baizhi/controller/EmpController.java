package com.baizhi.controller;

import com.baizhi.entity.City;
import com.baizhi.entity.Emp;
import com.baizhi.mapper.CityMapper;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    CityMapper cityMapper;

    @RequestMapping("emplist")
    public List<Emp> emplist(Model model) {
        List<Emp> list = empService.getAll();
        model.addAttribute("list", list);
        return list;
    }

    @RequestMapping("addEmp")
    public String addEmp(Emp emp) {
        empService.addEmp(emp);
        return "redirect:/emp/emplist.do";
    }

    @RequestMapping("updateEmp")
    public String updateEmp(Emp emp) {
        empService.changeEmpMessage(emp);
        return "redirect:/emp/emplist.do";
    }

    @RequestMapping("deleteEmp")
    public String deleteEmp(Integer id) {
        empService.dropEmp(id);
        return "redirect:/emp/emplist.do";
    }

    @RequestMapping("queryCity")
    public City queryCity() {
        City city = cityMapper.selectByPrimaryKey(1L);
        return city;
    }

}
