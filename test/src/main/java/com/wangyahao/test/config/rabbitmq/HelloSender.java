package com.wangyahao.test.config.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(Integer i) {
        String content = "hello " + new Date();
        System.out.println("发送消息:" + content + i);
        amqpTemplate.convertAndSend("hello", content + i);
    }
}
