package com.zua.howzhi.service;

import com.zua.howzhi.model.Collection;

import java.util.List;

/**AdminService
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 2:50
 */
public interface CollectionService {

    List<Collection> selectAll();
    Integer insert(Collection collection);
    List<Collection> selectByUser(Integer userId);
}
