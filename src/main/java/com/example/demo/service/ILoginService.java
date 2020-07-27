package com.example.demo.service;

import com.example.demo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILoginService {
    public String selectById(Integer id);
    public List<User> selectByUsername(String user);
    public List<User> selectByUsernameAndPassword(String username,String userpassword);
    public void addUser(User user);
    public String updateUser(User user);
}
