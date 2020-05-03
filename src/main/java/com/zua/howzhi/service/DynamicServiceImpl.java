package com.zua.howzhi.service;

import com.zua.howzhi.mapper.DynamicMapper;
import com.zua.howzhi.model.Dynamic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 15:27
 */
public class DynamicServiceImpl implements DynamicService{
    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public List<Dynamic> selectAll() {
        return dynamicMapper.selectAll();
    }
}
