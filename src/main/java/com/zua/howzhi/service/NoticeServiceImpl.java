package com.zua.howzhi.service;

import com.zua.howzhi.mapper.NoticeMapper;
import com.zua.howzhi.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-22 15:29
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public List<Notice> selectAll() {
        return noticeMapper.selectAll();
    }

    @Override
    public List <Notice> selectByCourse(Integer id) {
        return noticeMapper.selectByCourse(id);
    }
}
