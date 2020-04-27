package com.zua.howzhi.util.qcloudsms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-04-10 16:19
 */

public class SMSTest {
    @RequestMapping("/send")
    @ResponseBody
    public String Send (String phone,String code){
        String result=SMSUtil.sendSMS("18638575521","123456");
        return result;
    }
}
