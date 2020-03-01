package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Carousel;
import java.util.List;

public interface CarouselMapper {
    int insert(Carousel record);

    List<Carousel> selectAll();
}