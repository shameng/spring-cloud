package com.meng.streamhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamHelloApplicationTests {

    @Autowired
    private SinkSender sinkSender;

    @Test
    public void testSendMessage() {
        sinkSender.output().send(MessageBuilder.withPayload("from sinkSender").build());
    }

}
