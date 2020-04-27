package com.zua.howzhi.service;

import com.zua.howzhi.model.Carousel;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-22 13:07
 */
public interface CarouselService {
    List<Carousel> selectAll();

    void delete(Integer carouselId);

    void add (Carousel carousel);
}
