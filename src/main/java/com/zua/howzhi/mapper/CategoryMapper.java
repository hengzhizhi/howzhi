package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Category;
import java.util.List;

public interface CategoryMapper {
    int insert(Category record);

    List<Category> selectAll();
}