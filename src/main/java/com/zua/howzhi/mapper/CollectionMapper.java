package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Collection;
import com.zua.howzhi.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CollectionMapper {
    int deleteByPrimaryKey(Integer collectionId);

    int insert(Collection record);

    Collection selectByPrimaryKey(Integer collectionId);

    List<Collection> selectAll();

    int updateByPrimaryKey(Collection record);

    int queryFavTeacher(Integer id);

    int queryFavCategory(Integer id);

    List<Collection> selectByUser(Integer userId);
}