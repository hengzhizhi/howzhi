package com.zua.howzhi.service;

import com.zua.howzhi.model.Category;
import com.zua.howzhi.model.Course;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-20 9:26
 */
public interface CourseService {
    //查询课程种类
    List<Category> selectAllCategory();

    //根据id获取课程
    Course getById(Integer courseId);

    //获取所有课程
    List<Course> queryList();

    //根据删除课程
    void deleteById(Integer id);

    List<Course> queryRecommend();

    List<Course> queryByKind(Integer id);
}
