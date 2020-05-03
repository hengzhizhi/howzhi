package com.zua.howzhi.service;

import com.zua.howzhi.mapper.AdminMapper;
import com.zua.howzhi.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 2:50
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }
}
