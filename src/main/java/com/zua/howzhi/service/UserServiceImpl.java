package com.zua.howzhi.service;

import com.zua.howzhi.mapper.UserMapper;
import com.zua.howzhi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description  用户Service
 * @Author Hengzhi
 * @Create 2020-03-01 12:45
 *
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean isExist(String username) {
       User user= userMapper.selectByUserName(username);
        return user!=null;
    }

    @Override
    public User getByName(String username) {
        User user =userMapper.selectByUserName(username);
        return user;
    }

    @Override
    public User geById(Integer id) {
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }


    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
