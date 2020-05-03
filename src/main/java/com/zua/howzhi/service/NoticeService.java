package com.zua.howzhi.service;

import com.zua.howzhi.model.Notice;

import java.util.List;

/**AdminService
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 2:50
 */

public interface NoticeService {
    List<Notice> selectAll();

   List <Notice> selectByCourse(Integer id);
}
