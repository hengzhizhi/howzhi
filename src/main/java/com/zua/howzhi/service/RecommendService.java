package com.zua.howzhi.service;

import com.zua.howzhi.model.Course;
import com.zua.howzhi.model.User;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-30 14:39
 */
public interface RecommendService {
    List<Course> unLoginRec();
    List<Course> loginRec(User user);
}
