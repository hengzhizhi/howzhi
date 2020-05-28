package com.zua.howzhi.controller;


import cn.hutool.db.Session;
import com.zua.howzhi.mapper.UserMapper;
import com.zua.howzhi.model.Collection;
import com.zua.howzhi.model.Course;
import com.zua.howzhi.model.User;
import com.zua.howzhi.service.CollectionService;
import com.zua.howzhi.service.CourseService;
import com.zua.howzhi.service.UserService;
import com.zua.howzhi.util.qcloudsms.SMSUtil;
import jdk.nashorn.internal.runtime.Undefined;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-01 12:29
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    CollectionService collectionService;
    @Autowired
    CourseService courseService;

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

    //用户注册
    @CrossOrigin
    @RequestMapping("/register")
    @ResponseBody
    public String regist(@RequestBody User user, HttpSession session) {
        String result = null;
        String code = user.getQq();
        String co = (String) session.getAttribute("code");
        user.setHeader("static/img/head.jpg");
        if (code.equals(co)) {
            userService.add(user);
            result = "注册成功请进行登录";
        } else {
            result = "验证码校验错误，注册失败";
        }
        log.info(user.toString());
        return result;

    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile[] files, User user) {
        try {
            log.info(user.toString());
            System.out.println(user);
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

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/logout")
    public void logout(HttpSession session) {
        session.removeAttribute("user");
    }

    //短信验证
    @CrossOrigin
    @RequestMapping("/send")
    @ResponseBody
    public String sendCode(@RequestBody User user, HttpSession session) {
        String result = null;
        String str = "0123456789";
        User uu = new User();
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        String code = sb.toString();
        session.setAttribute("code", code);
        String phone = user.getMobile();
        if (userService.getByMobile(phone) == null) {
            result = SMSUtil.sendSMS(phone, code);
        } else {
            result = "该号码已注册,验证码发送失败";
        }
        return result;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectAll")
    public List<User> selectAll() {
        List<User> list = userService.selectAll();
        log.info(list.toString());
        return userService.selectAll();
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/collect")
    public Integer collect(@RequestBody Course course, HttpSession session) {
        Collection collection = new Collection();
        User uu = (User) session.getAttribute("user");
        collection.setUserId((Integer) uu.getId());
        collection.setVideoId(1);
        log.info(course.getCourseId().toString());
        collection.setCourseId((Integer) course.getCourseId());
        return collectionService.insert(collection);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getCollection")
    public List<Course> getcollection(HttpSession session) {
        if(session.getAttribute("user") == null ){
            return null;
        }else {
            Integer userId = ((User) session.getAttribute("user")).getId();
            List<Collection> collections = collectionService.selectByUser(userId);
            List<Course> courses = new ArrayList();
            for (int i = 0; i < collections.size(); i++) {
                Course course = courseService.getById(collections.get(i).getCourseId());
                courses.add(course);
            }
            return courses;
        }
    }
}
