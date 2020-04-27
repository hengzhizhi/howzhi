package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface CourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    Course selectByPrimaryKey(Integer courseId);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);
}