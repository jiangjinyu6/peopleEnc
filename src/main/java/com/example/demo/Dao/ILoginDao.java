package com.example.demo.Dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
@Repository
public interface ILoginDao {
    @Select("select username,userpassword from uservip where id = #{id}")
    public String selectById(Integer id);
    @Select("select username,userpassword from uservip where username = #{username}")
    public List<User> selectByUsername(String user);
    @Select("select username,userpassword from uservip where username = #{username} and userpassword = #{userpassword}")
    public List<User> selectByUsernameAndPassword(@Param("username") String username, @Param("userpassword") String userpassword);

    @Insert("insert into uservip(username,userpassword,email) values(#{username},#{password},#{email})")
    public void addUser(User user);

    @Update("update uservip set username=#{username},userpassword=#{password} where id=#{id}")
    public String updateUser(User user);
}
