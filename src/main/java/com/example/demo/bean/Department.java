package com.example.demo.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "department")
public class Department{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer dept_Id;
	@Column
	private String email;
	@Column
	private String intro;
	@Column
	private String department_Name;
	@Column
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeptId() {
		return dept_Id;
	}

	public void setDeptId(Integer deptId) {
		this.dept_Id = deptId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getDepartmentName() {
		return department_Name;
	}

	public void setDepartmentName(String departmentName) {
		this.department_Name = departmentName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
