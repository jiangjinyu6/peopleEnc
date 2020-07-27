package com.example.demo.service;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IEmpService {
    int add(Employee emp);//添加到数据库操作
    Employee  selectById(Integer id);
    List<Employee> findAll();
    public int deleteDeptById(Integer id);
    public int updateDept(Employee employee);
}
