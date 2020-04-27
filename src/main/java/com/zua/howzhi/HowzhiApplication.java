package com.zua.howzhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//项目启动类
@SpringBootApplication
public class HowzhiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(HowzhiApplication.class);
    }
    public static void main(String[] args) {

        SpringApplication.run(HowzhiApplication.class, args);
    }

}
