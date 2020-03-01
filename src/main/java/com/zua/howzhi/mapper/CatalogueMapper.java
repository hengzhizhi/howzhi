package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Catalogue;
import java.util.List;

public interface CatalogueMapper {
    int deleteByPrimaryKey(Integer catalogueId);

    int insert(Catalogue record);

    Catalogue selectByPrimaryKey(Integer catalogueId);

    List<Catalogue> selectAll();

    int updateByPrimaryKey(Catalogue record);
}