package com.zua.howzhi.service;

import com.zua.howzhi.model.Dynamic;

import java.util.List;

/**AdminService
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 2:50
 */
public interface DynamicService {
    List<Dynamic> selectByUser(Integer userId);

    List<Dynamic> selectAll();

    void insert (Dynamic dynamic);

    void  Delete (Integer dynamicId);

}
