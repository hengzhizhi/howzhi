package com.zua.howzhi.service;

import com.zua.howzhi.mapper.CarouselMapper;
import com.zua.howzhi.model.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-22 13:07
 */
@Service
public class CarouselserviceImpl implements CarouselService {
    @Autowired
    private CarouselMapper mapper;

    @Override
    public List<Carousel> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public void delete(Integer carouselId) {
        mapper.deleteByPrimaryKey(carouselId);
    }

    @Override
    public void add(Carousel carousel) {
        mapper.insert(carousel);
    }
}
