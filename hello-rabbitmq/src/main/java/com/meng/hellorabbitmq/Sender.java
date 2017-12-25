package com.meng.hellorabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xindemeng
 * @datetime 2017/12/25 11:44
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String content = "hello, rabbitmq. - " + new Date();
        System.out.println("Sender: " + content);
        rabbitTemplate.convertAndSend("hello", content);
    }
}
