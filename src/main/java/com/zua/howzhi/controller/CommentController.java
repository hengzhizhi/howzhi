package com.zua.howzhi.controller;

import com.zua.howzhi.model.Comment;
import com.zua.howzhi.service.CommentService;
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
 * @Create 2020-03-27 15:41
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectByCourse")
    public List<Comment> selcetByCourse(@RequestParam Integer courseId) {
        return commentService.selectByCourse(courseId);

    }

}
