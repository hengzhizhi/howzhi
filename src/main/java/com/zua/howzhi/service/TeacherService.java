package com.zua.howzhi.service;

import com.zua.howzhi.model.Teacher;

import java.util.List;

/**AdminService
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 2:50
 */
public interface TeacherService {
    List<Teacher> selectAll();
    Teacher selectById(Integer id);
}
