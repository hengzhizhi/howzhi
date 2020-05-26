package com.zua.howzhi.service;

import com.zua.howzhi.model.User;

import java.util.List;


/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-01 12:39
 */

public interface UserService {

    boolean isExist(String username);

    User getByName(String username);

    User getByMobile(String mobile);

    User geById(Integer id);

    void add(User user);

    List<User> selectAll();

}
