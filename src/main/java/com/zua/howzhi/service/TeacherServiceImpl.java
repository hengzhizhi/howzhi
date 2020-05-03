package com.zua.howzhi.service;

import com.zua.howzhi.mapper.TeacherMapper;
import com.zua.howzhi.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 15:30
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> selectAll() {

        return teacherMapper.selectAll();
    }

    @Override
    public Teacher selectById(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }
}
