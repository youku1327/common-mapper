package com.kingboya.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author 林 lsc
 * @Description 通用mapper启动类
 * @Date 2019/8/21 9:24
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.kingboya.common.mapper")//tk包
@ComponentScan("com.kingboya.common.*")
public class CommonApp01 {

    public static void main(String[] args) {

        SpringApplication.run(CommonApp01.class,args);
    }
}
