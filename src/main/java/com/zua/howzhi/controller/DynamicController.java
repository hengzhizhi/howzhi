package com.zua.howzhi.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.db.Session;
import com.zua.howzhi.model.Comment;
import com.zua.howzhi.model.Dynamic;
import com.zua.howzhi.model.User;
import com.zua.howzhi.service.CommentService;
import com.zua.howzhi.service.DynamicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-27 15:41
 */
@Slf4j
@Controller
@RequestMapping("/dynamic")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping ("/selectAll")
    public List<Dynamic> selectAll() {
        System.out.println("动态查询");
        return dynamicService.selectAll();
    }


    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectByUser")
    public List<Dynamic> selectByUser(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return null;
        } else {
            Integer userId = ((User) session.getAttribute("user")).getId();
            return dynamicService.selectByUser(userId);
        }

    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/doDynamic")
    public void doDynamic(@RequestBody Dynamic dynamic, HttpSession session) {
        User uu = (User) session.getAttribute("user");
        DateTime dt = new DateTime();
        dynamic.setCreateTime(dt.toString());
        dynamic.setUserId(uu.getId());
        dynamic.setTitle(uu.getRealname());
        dynamicService.insert(dynamic);
    }
}
