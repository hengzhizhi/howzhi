package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Collection;
import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer collectionId);

    int insert(Collection record);

    Collection selectByPrimaryKey(Integer collectionId);

    List<Collection> selectAll();

    int updateByPrimaryKey(Collection record);
}