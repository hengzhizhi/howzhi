package com.zua.howzhi.service;

import com.zua.howzhi.mapper.CategoryMapper;
import com.zua.howzhi.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 课程类别Service
 * @Author Hengzhi
 * @Create 2020-03-22 8:50
 */
@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired
private CategoryMapper categoryMapper;
    @Override
    public List<Category> queryTypes() {
        return categoryMapper.selectAll();
    }
}
