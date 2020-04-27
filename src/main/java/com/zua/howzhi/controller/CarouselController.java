package com.zua.howzhi.controller;

import com.zua.howzhi.model.Carousel;
import com.zua.howzhi.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-22 10:52
 */
@Controller
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    CarouselService carouselService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectAll")
    public List<Carousel> selectAll() {
        return carouselService.selectAll();
    }


}
