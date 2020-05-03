package com.zua.howzhi.service;

import com.zua.howzhi.mapper.DemoMapper;
import com.zua.howzhi.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-20 18:50
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public int insert(Demo demo) {
        return demoMapper.insert(demo);
    }

    public int delete(String name) {
        return demoMapper.delete(name);
    }

    public int update(Demo demo) {
        return demoMapper.update(demo);
    }

    public Demo selectByName(String name) {
        return demoMapper.selectByName(name);
    }

    public List<Demo> selectAll() {
        System.out.println("aa");
        return demoMapper.selectAll();
    }

}
