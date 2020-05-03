package com.zua.howzhi.mapper;

import com.zua.howzhi.model.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    Notice selectByPrimaryKey(Integer noticeId);

    List<Notice> selectAll();

    int updateByPrimaryKey(Notice record);

    List <Notice> selectByCourse(Integer noticeId);

}