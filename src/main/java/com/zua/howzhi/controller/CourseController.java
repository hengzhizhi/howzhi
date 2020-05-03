package com.zua.howzhi.controller;

import com.zua.howzhi.model.*;
import com.zua.howzhi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-20 9:23
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CatalogueService catalogueService;

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private NoticeService noticeService;

    //查询全部课程
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectAll")
    public List<Course> queryList() {
        return courseService.queryList();
    }

    //按类别查询
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectTypes")
    public List<Category> queryTypes() {
        return categoryService.queryTypes();
    }

    //按ID查询
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectById")
    public Course selectById(@RequestParam Integer courseId) {

        System.out.println(courseService.getById(courseId));
        return courseService.getById(courseId);
    }

    //查询课程章节
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectChapter")
    public List<Catalogue> selectChapter(@RequestParam Integer courseId) {
        return catalogueService.selectByCourse(courseId);
    }

    //根据课程ID查询教师信息
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/queryTeacher")
    public Teacher queryTeacher(@RequestParam Integer courseId) {
        Course course = courseService.getById(courseId);
        return teacherService.selectById(course.getTeacherId());
    }

    //根据课程查询公告信息
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectNotice")
    public List<Notice> queryNotice(@RequestParam Integer courseId) {
        return noticeService.selectByCourse(courseId);
    }

}
