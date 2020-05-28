package com.zua.howzhi.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.zua.howzhi.model.Comment;
import com.zua.howzhi.model.User;
import com.zua.howzhi.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Iterator;
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
//        for(Iterator<Comment> item = comments.iterator(); item.hasNext();){
//            Comment  comment =item.next();
//            log.info("评论日期"+comment.getDate().toString());
//            log.info(DateUtil.parse(comment.getDate(),"yyyy-MM-dd");
//            DateUtil.parse(str1, "yyyy-MM-dd")
//           comment.setDate(DateUtil.format(comment.getDate(), "yyyy年MM月dd日")); ;
//            log.info("hutool处理日期"+DateUtil.format(comment.getDate(), "yyyy年MM月dd日").toString());
//        }
        return commentService.selectByCourse(courseId);


    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("/doComment")
    public void doComment(@RequestBody Comment comment , HttpSession session) {
        User uu=(User) session.getAttribute("user");
        DateTime dt=new DateTime();
        comment.setDate(dt.toString());
        comment.setUserId(uu.getId());
        comment.setParentId(0);
        log.info(comment.toString());
         commentService.insert(comment);
    }
}
