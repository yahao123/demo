package com.wangyahao.test.config.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    private void receiver(String hello) {
        System.out.println("1接受消息:" + hello);
    }
}
