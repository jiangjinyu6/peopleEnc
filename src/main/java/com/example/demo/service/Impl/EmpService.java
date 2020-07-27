package com.example.demo.service.Impl;

import com.example.demo.Dao.IDepartmentDao;
import com.example.demo.Dao.IEmployeeDao;
import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.service.IEmpService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpService implements IEmpService {

    IEmployeeDao IEmp;
    IDepartmentDao IDept;

    public EmpService(IEmployeeDao IEmp, IDepartmentDao IDept) {
        this.IEmp = IEmp;
        this.IDept = IDept;
    }

    @Override
    public int add(Employee emp) {
        return IEmp.add(emp);
    }

    @Override
    public Employee  selectById(Integer id) {
        return IEmp.selectById(id);
    }

    @Override
    public List<Employee> findAll() {
        return IEmp.findAll();
    }

    @Override
    public int deleteDeptById(Integer id) {
        return IEmp.deleteEmpById(id);
    }

    @Override
    public int updateDept(Employee employee) {
        return IEmp.updateEmp(employee);
    }

    public int updateDept(Department department) {
        return 0;
    }
}
