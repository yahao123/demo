package com.wangyahao.test.controller;

import com.wangyahao.test.config.rabbitmq.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HelloSender helloSender;


    @ResponseBody
    @GetMapping("/testRabbitMq")
    public Object testController() {
        for (int i = 0; i < 10; i++) {
            helloSender.send(i);
        }
        return "hello";
    }


    public static void main(String[] args) {

        String str1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuffer("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }


}
