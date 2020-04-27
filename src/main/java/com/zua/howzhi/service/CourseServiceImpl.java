package com.zua.howzhi.service;

import com.zua.howzhi.mapper.CategoryMapper;
import com.zua.howzhi.mapper.CourseMapper;
import com.zua.howzhi.model.Category;
import com.zua.howzhi.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description 课程service
 * @Author Hengzhi
 * @Create 2020-03-20 9:27
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectAllCategory() {
        return categoryMapper.selectAll();
    }

    @Override
    public Course getById(Integer courseId) {

        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public List<Course> queryList() {
        return courseMapper.selectAll();
    }

    @Override
    public void deleteById(Integer id) {

    }
}
