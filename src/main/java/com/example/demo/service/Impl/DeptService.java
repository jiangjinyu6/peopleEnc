package com.example.demo.service.Impl;

import com.example.demo.Dao.IDepartmentDao;
import com.example.demo.bean.Department;
import com.example.demo.service.IDeptService;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class DeptService implements IDeptService {
    private IDepartmentDao departmentDao;

    @Override
    public List<Department> getDept() {
        return null;
    }

    @Override
    public Department selectById(Integer id) {
        return null;
    }

    @Override
    public void insertDept(Department department) {

    }

    @Override
    public int deleteDeptById(Integer id) {
        return 0;
    }

    @Override
    public int updateDept(Department department) {
        return 0;
    }

    @Override
    public Collection<Department> getDepartments() {
        return null;
    }

    @Override
    public Department saveDepartment(Department department) {
        Department department1 = departmentDao.save(department);
        return department1;
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentDao.delete(department);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentDao.deleteById(id);
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public Department findDepartment(Integer id) {
        return departmentDao.findById(id).get();
    }
}
