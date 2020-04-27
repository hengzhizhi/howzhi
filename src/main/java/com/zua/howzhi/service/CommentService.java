package com.zua.howzhi.service;

import com.zua.howzhi.mapper.CommentMapper;
import com.zua.howzhi.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-27 15:42
 */

public interface CommentService {
   List<Comment> selectByCourse(Integer courseId);
   void delete (Integer commentId);
   Comment selectById(Integer commentId);
}
