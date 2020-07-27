package com.example.demo.controller;

import com.example.demo.Dao.IDepartmentDao;
import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.service.IDeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class DeptController {
    private IDeptService deptService;
    private IDepartmentDao departmentDao;

    public DeptController(IDeptService deptService,IDepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
        this.deptService = deptService;
    }

    @RequestMapping("/depts")
    public String deptSelect(Model model){
        departmentDao.findAll();
        List<Department> departments = departmentDao.findAll();
        model.addAttribute("depts", departments);
        return "dept/deptList";
    }

    //来到添加页面
    @GetMapping("/dept")
    public String toAddPage(){
        return "dept/deptAdd";
    }
    //添加部门
    @PostMapping("/dept")
    public String addEmp(Department department){
        departmentDao.save(department);
        return "redirect:/depts";
    }
//
    //来到修改页面
    @GetMapping("/dept{id}")
    public String toEdits(@PathVariable("id") Integer id, Model model){

        Department department = deptService.findDepartment(id);
        model.addAttribute("depts",department);

        return "dept/deptAdd";
    }
    //修改部门
    @PutMapping("/dept")
    public String updateEmployee(Department department){
        departmentDao.saveAndFlush(department);
        return "redirect:/depts";
    }

    //删除部门
    @DeleteMapping("/dept{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        departmentDao.deleteById(id);
        return "redirect:/depts";
    }
}
