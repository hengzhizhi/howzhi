package com.zua.howzhi.controller;

import com.zua.howzhi.model.Teacher;
import com.zua.howzhi.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-29 18:08
 */

@Slf4j
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public List<Teacher> selectAll() {
        List<Teacher> list = teacherService.selectAll();
        log.info(list.toString());
        return teacherService.selectAll();
    }

    @ResponseBody
    @PostMapping ("/selectById")
    public Teacher SelectById(@RequestParam Integer id) {
        Teacher teacher = teacherService.selectById(id);
        log.info(teacher.toString());
        return teacherService.selectById(id);
    }

}
