package com.zua.howzhi.service;

import com.zua.howzhi.model.Course;
import com.zua.howzhi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-30 14:40
 */
@Service
public class RecommendServiceImpl  implements RecommendService{
    @Override
    public List<Course> unLoginRec() {
        return null;
    }

    @Override
    public List<Course> loginRec(User user) {
        return null;
    }
}
