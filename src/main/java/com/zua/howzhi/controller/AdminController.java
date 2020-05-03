package com.zua.howzhi.controller;

import com.zua.howzhi.model.Admin;
import com.zua.howzhi.model.Carousel;
import com.zua.howzhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-29 18:08
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectAll")
    public List<Admin> selectAll() {
        return adminService.selectAll();
    }
}
