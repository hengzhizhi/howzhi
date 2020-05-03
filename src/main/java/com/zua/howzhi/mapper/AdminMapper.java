package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface AdminMapper {
    int insert(Admin record);

    List<Admin> selectAll();
}