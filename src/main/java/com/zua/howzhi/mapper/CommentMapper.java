package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface CommentMapper {
    void deleteByPrimaryKey(Integer commentId);

    void insert(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);

    List<Comment> selectByCourse(Integer courseId);
}