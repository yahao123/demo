package com.wangyahao.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangyahao
 * @ClassName IosPayApplication
 * @Description 启动类
 * @date 2018/8/28 15:55
 **/

@SpringBootApplication
@ComponentScan(basePackages = {"com.wangyahao"})
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
