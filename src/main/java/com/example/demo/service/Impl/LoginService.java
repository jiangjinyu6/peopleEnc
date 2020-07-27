package com.example.demo.service.Impl;

import com.example.demo.Dao.ILoginDao;
import com.example.demo.bean.User;
import com.example.demo.service.ILoginService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginService implements ILoginService {
    private ILoginDao loginDao;

    public LoginService(ILoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public String selectById(Integer id) {
        return loginDao.selectById(id);
    }

    @Override
    public List<User> selectByUsername(String user) {
        return loginDao.selectByUsername(user);
    }

    @Override
    public List<User> selectByUsernameAndPassword(String username,String userpassword) {
        return loginDao.selectByUsernameAndPassword(username,userpassword);
    }

    @Override
    public void addUser(User user) {
        loginDao.addUser(user);
    }

    @Override
    public String updateUser(User user) {
        return loginDao.updateUser(user);
    }
}
