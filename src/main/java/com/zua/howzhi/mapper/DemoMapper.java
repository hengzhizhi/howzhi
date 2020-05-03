package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-20 18:49
 */
@Component
@Mapper
public interface DemoMapper {
    //增
    int insert (Demo demo);
    //删
    int delete (String name);
    //改
    int update(Demo demo);
    //主键查
    Demo selectByName(String name);
    //查
    List<Demo> selectAll();

}
