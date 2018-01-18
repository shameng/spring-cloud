package com.meng.streamhello;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * @author xindemeng
 * @datetime 2018/1/16 23:26
 */
public interface SinkSender {

    @Output(Sink.INPUT)
    MessageChannel output();
}
