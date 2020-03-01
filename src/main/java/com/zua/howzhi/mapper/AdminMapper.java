package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Admin;
import java.util.List;

public interface AdminMapper {
    int insert(Admin record);

    List<Admin> selectAll();
}