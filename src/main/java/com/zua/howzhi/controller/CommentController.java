package com.zua.howzhi.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import com.zua.howzhi.model.Comment;
import com.zua.howzhi.model.User;
import com.zua.howzhi.service.CommentService;
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
    @CrossOrigin
    @ResponseBody
    @PostMapping("/doComment")
    public void doComment(@RequestBody Comment comment , HttpSession session) {
        User uu=(User) session.getAttribute("user");
        DateTime dt=new DateTime();
        comment.setDate(dt);
        comment.setUserId(uu.getId());
        comment.setParentId(0);
        log.info(comment.toString());
         commentService.insert(comment);
    }
}
