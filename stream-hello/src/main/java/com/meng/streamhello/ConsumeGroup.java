package com.meng.streamhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author meng
 * @create 2018-01-19 13:39
 **/
@EnableBinding(value = Sink.class)
public class ConsumeGroup {

    private static final Logger logger = LoggerFactory.getLogger(ConsumeGroup.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }

}
