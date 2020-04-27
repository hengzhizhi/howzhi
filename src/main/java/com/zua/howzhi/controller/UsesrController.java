package com.zua.howzhi.controller;


import com.zua.howzhi.model.User;
import com.zua.howzhi.service.UserService;
import com.zua.howzhi.util.qcloudsms.SMSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-01 12:29
 */
@Controller
@RequestMapping("/user")
public class UsesrController {
    @Autowired
    UserService userService;


    @CrossOrigin
    @ResponseBody
    @PostMapping("/login")
    public User login(@RequestBody User user, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();
        //数据库中获取用户信息
        User userData = userService.getByName(username);
        String name = userData.getUsername();
        String pass = userData.getPassword();
        //判断用户是否存在,存在将数据库中user信息放入session
        boolean isExist = userService.isExist(username);
        if (isExist = true) {
            session.setAttribute("user", userData);
            System.out.println("登录" + session.getId());
        }
        //登录
        if (Objects.equals(name, username) || Objects.equals(pass, password)) {
            String message = "账号密码错误";
            System.out.println(userData);
            return userData;
        } else {
            return null;
        }

    }


    @CrossOrigin
    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile[] files, String name) {
        try {
            System.out.println(name);
            for (MultipartFile file : files) {
                File newFile = new File("D:/upload/" + file.getOriginalFilename());
                file.transferTo(newFile);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "success";
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getInfo")

//    public int getInfo(HttpSession session) {
//        System.out.println("校验"+session.getId());
//        String username = (String) session.getAttribute("username");
//        System.out.println(username);
//        if (session.getAttribute("user")!=null) {
//            return 1;
//        } else {
//            return 0;@CrossOrigin
//        }
//    }
    public User getInfo(HttpSession session) {
        System.out.println("校验" + session.getId());
        String username = (String) session.getAttribute("username");
        System.out.println(username);
        if (session.getAttribute("user") != null) {
            return (User) session.getAttribute("user");
        } else {
            return null;
        }
    }

//短信验证

    @RequestMapping("/send")
    @ResponseBody
    public String Send(String phone, String code) {
        String result = SMSUtil.sendSMS("18638575521", "123456");
        return result;
    }

    //用户注册
    @RequestMapping("/regist")
    @ResponseBody
    public String regist(String phone, String code) {
        String str = "0123456789";
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        code = sb.toString();
        String result = SMSUtil.sendSMS("18638575521", code);
        return result;
    }
}
