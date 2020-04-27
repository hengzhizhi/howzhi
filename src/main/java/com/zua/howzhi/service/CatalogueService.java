package com.zua.howzhi.service;

import com.zua.howzhi.model.Catalogue;
import com.zua.howzhi.model.Category;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-22 11:05
 */
public interface CatalogueService {
    Catalogue selectById(Integer catalogueId);
    List<Catalogue> selectAll();
    void delete (Integer catalogueId);
    List<Catalogue> selectByCourse(Integer courseId);
}
