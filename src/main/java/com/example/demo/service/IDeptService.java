package com.example.demo.service;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IDeptService {
    Department saveDepartment(Department Department);
    void deleteDepartment(Department Department);
    void deleteDepartment(Integer id);
    Department updateDepartment(Department Department);
    Department findDepartment(Integer id);
    List<Department> getDept();
    Department selectById(Integer id);
    void insertDept(Department department);
    int deleteDeptById(Integer id);
    int updateDept(Department department);
    Collection<Department> getDepartments();
}
