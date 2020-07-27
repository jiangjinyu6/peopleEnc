package com.example.demo.Dao;

import com.example.demo.bean.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDepartmentDao extends JpaRepository<Department,Integer> {
}
