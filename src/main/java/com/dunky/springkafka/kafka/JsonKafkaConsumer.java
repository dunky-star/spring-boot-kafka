package com.dunky.springkafka.kafka;

import com.dunky.springkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId="myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}
