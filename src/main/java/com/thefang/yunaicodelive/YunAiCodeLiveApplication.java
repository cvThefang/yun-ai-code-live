package com.thefang.yunaicodelive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.thefang.yunaicodelive.mapper")
public class YunAiCodeLiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunAiCodeLiveApplication.class, args);
    }

}
