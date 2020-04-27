package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Carousel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
//轮播图
@Mapper
@Component
public interface CarouselMapper {
    int insert(Carousel record);

    List<Carousel> selectAll();

    void deleteByPrimaryKey(Integer courseId);
}