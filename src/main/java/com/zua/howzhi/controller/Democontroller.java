package com.zua.howzhi.controller;

import com.zua.howzhi.model.Demo;
import com.zua.howzhi.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-20 18:48
 */
@Slf4j
@Controller
public class Democontroller {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public String index() {
        return "test";
    }

    //测试
    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        Date date = new Date();
        log.info(date.toString());
        return "test";
    }

    //增
    @ResponseBody
    @RequestMapping("/insert")
    public String insert(Demo demo, Model model) {
        log.info(demo.toString());
        demoService.insert(demo);
        List<Demo> list = demoService.selectAll();
        model.addAttribute("list", list);
        return "test";
    }

    //删
    @ResponseBody
    @RequestMapping("/delete")
    public int delete(String name) {
        return demoService.delete(name);
    }

    //改
    @ResponseBody
    @RequestMapping("/update")
    public int update(Demo demo) {
        return demoService.update(demo);
    }

    //查
    @ResponseBody
    @RequestMapping("/selectByname")
    public Demo selectByname(String name) {
        return demoService.selectByName(name);
    }

    //查全部
    @ResponseBody
    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        System.out.println(demoService.selectAll().toString());
        List<Demo> list = demoService.selectAll();
        model.addAttribute("list", list);
        return "test";
    }


}
