package com.example.demo.controller;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.service.IDeptService;
import com.example.demo.service.IEmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@Controller
public class EmpController {

    private IEmpService empService;
    private IDeptService deptService;

    public EmpController(IEmpService empService, IDeptService deptService) {
        this.empService = empService;
        this.deptService = deptService;
    }
    //查询所有员工信息
    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> list = empService.findAll();
        model.addAttribute("emps",list);
        return "emp/EmpList";
    }

    //来到添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = deptService.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/EmpAdd";
    }
    //添加员工
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        empService.add(employee);
        return "redirect:/emps";
    }

    //来到修改页面
    @GetMapping("/emp{id}")
    public String toEdits(@PathVariable("id") Integer id,Model model){

        Employee employee = empService.selectById(id);
        model.addAttribute("emp",employee);

        Collection<Department> departments = deptService.getDepartments();
        model.addAttribute("depts", departments);

        return "emp/EmpAdd";
    }
    //修改员工
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        empService.updateDept(employee);
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/emp{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        empService.deleteDeptById(id);
        return "redirect:/emps";
    }
}
