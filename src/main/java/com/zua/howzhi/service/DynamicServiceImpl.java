package com.zua.howzhi.service;

import com.zua.howzhi.mapper.DynamicMapper;
import com.zua.howzhi.model.Dynamic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 15:27
 */
@Service
public class DynamicServiceImpl implements DynamicService {
    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public List<Dynamic> selectByUser(Integer userId) {
        return dynamicMapper.selectByUser(userId);
    }

    @Override
    public List<Dynamic> selectAll() {
        return dynamicMapper.selectAll();
    }

    @Override
    public void insert(Dynamic dynamic) {
        dynamicMapper.insert(dynamic);
    }

    @Override
    public void Delete(Integer dynamicId) {
        dynamicMapper.deleteByPrimaryKey(dynamicId);
    }
}
