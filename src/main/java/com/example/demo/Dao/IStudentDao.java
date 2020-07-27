package com.example.demo.Dao;

import com.example.demo.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentDao extends JpaRepository<Student,Integer> {
}
