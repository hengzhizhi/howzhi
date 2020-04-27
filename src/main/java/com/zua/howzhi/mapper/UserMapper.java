package com.zua.howzhi.mapper;

import com.zua.howzhi.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    User selectByUserName(String username);

//    User login(String username);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

}