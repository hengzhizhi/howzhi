package com.zua.howzhi.service;

import com.zua.howzhi.mapper.CommentMapper;
import com.zua.howzhi.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-27 15:42
 */
@Service
public class CommentServiceImpl implements CommentService
{
    @Autowired
    CommentMapper mapper;

    @Override
    public List<Comment> selectByCourse(Integer courseId) {
        return mapper.selectByCourse(courseId);
    }

    @Override
    public void delete(Integer commentId) {
mapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public Comment selectById(Integer commentId) {
        return mapper.selectByPrimaryKey(commentId);
    }
}
