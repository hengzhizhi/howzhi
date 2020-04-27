package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
//课程类别
@Component
@Mapper
public interface CategoryMapper {
    int insert(Category record);

    List<Category> selectAll();
}