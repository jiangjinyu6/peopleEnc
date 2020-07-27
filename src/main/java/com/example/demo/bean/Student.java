package com.example.demo.bean;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String StuName;
    @Column
    private String StuPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getStuPassword() {
        return StuPassword;
    }

    public void setStuPassword(String stuPassword) {
        StuPassword = stuPassword;
    }
}
