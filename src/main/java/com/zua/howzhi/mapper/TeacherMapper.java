package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);
}