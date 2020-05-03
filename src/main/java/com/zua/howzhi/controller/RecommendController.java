package com.zua.howzhi.controller;

import com.zua.howzhi.model.User;
import com.zua.howzhi.service.RecommendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-30 14:37
 */
@Slf4j
@Controller
public class RecommendController {
    @Autowired
    RecommendService recommend;
    @CrossOrigin
    @ResponseBody
    @PostMapping("/login")
    public User login(@RequestBody  HttpSession session) {
        if (session.getAttribute("user") ==null){
            recommend.unLoginRec();
        }else {
            User uu= (User) session.getAttribute("user");

            recommend.loginRec(uu);
        }
       return null;
    }
}
