package com.zua.howzhi.controller;

import com.zua.howzhi.model.Catalogue;
import com.zua.howzhi.model.Category;
import com.zua.howzhi.model.Course;
import com.zua.howzhi.service.CatalogueService;
import com.zua.howzhi.service.CategoryService;
import com.zua.howzhi.service.CourseService;
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

}
