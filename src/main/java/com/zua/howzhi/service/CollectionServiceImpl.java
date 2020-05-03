package com.zua.howzhi.service;

import com.zua.howzhi.mapper.CollectionMapper;
import com.zua.howzhi.model.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 15:25
 */
@Service
public class CollectionServiceImpl implements CollectionService{
    @Autowired
    private CollectionMapper collectionMapper;
    @Override
    public List<Collection> selectAll() {
        return collectionMapper.selectAll();
    }

    @Override
    public Integer insert(Collection collection) {
        return collectionMapper.insert(collection);
    }

    @Override
    public List<Collection> selectByUser(Integer userId) {
        return collectionMapper.selectByUser(userId);
    }
}
