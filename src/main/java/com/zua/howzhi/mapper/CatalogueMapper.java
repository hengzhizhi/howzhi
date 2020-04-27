package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Catalogue;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
//目录
@Component
@Mapper
public interface CatalogueMapper {
    int deleteByPrimaryKey(Integer catalogueId);

    int insert(Catalogue record);

    Catalogue selectByPrimaryKey(Integer catalogueId);

    List<Catalogue> selectAll();

    int updateByPrimaryKey(Catalogue record);

    List<Catalogue> selectByCourse(Integer courseId);
}