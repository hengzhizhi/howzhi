package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Dynamic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DynamicMapper {
    int deleteByPrimaryKey(Integer dynamicId);

    int insert(Dynamic record);

    Dynamic selectByPrimaryKey(Integer dynamicId);

    List<Dynamic> selectAll();

    int updateByPrimaryKey(Dynamic record);
}