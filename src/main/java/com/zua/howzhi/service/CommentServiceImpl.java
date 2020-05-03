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
    CommentMapper commentMapper;

    @Override
    public List<Comment> selectByCourse(Integer courseId) {
        return commentMapper.selectByCourse(courseId);
    }

    @Override
    public void delete(Integer commentId) {
        commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public Comment selectById(Integer commentId) {
        return commentMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public void insert(Comment comment) {
        commentMapper.insert(comment);
    }
}
