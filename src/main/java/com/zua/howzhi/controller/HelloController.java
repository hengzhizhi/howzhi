package com.zua.howzhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-09 21:23
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public ModelAndView hello() {
        System.out.println("aaa");
        return new ModelAndView("/hello");
    }
    @ResponseBody
    @RequestMapping ("/test")
    public String test() {
        return "测试";
//        log.info("日志测试");
    }
}
