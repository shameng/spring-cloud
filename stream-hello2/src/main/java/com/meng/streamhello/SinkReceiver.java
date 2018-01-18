package com.meng.streamhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author xindemeng
 * @datetime 2018/1/7 22:42
 */
@EnableBinding({SinkSender.class})
public class SinkReceiver {

    private static final Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receiver(Object payload) {
        logger.info("receiverd: " + payload);
    }
}
