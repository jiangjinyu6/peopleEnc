package com.example.demo.Dao;

import com.example.demo.bean.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IEmployeeDao {
    @Select("select a.*,b.department_Name from employee a,department b where a.did=b.id")
    List<Employee> findAll();

    @Select("select * from employee a where id = #{id}")
    Employee  selectById(Integer id);

    @Insert("insert into employee(lastName,email,gender,dId,birth) values(#{lastName},#{email},#{gender},#{dId},#{birth})")
    int add(Employee emp);

    @Delete("delete from employee where id = #{id}")
    public int deleteEmpById(Integer id);

    @Update("update employee set lastName = #{lastName},email = #{email},gender = #{gender},dId = #{dId},birth = #{birth} where id=#{id}")
    public int updateEmp(Employee employee);
}
