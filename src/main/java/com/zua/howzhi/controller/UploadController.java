package com.zua.howzhi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-20 14:54
 */

@RestController
public class UploadController {
    @CrossOrigin
    @RequestMapping("/howzhi/upload")
    @ResponseBody
    public  String upload(MultipartFile file){
        if(Objects.isNull(file) || file.isEmpty()){
            return "文件为空，请重新上传";
        }
        try {
            byte[] bytes=file.getBytes();
//            Path path= Paths.get()
        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }
}
