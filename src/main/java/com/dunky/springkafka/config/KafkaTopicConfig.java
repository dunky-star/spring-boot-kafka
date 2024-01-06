package com.dunky.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic dunkyjavaTopic(){
        return TopicBuilder.name("dunkyjava")
                .build();
    }

    @Bean
    public NewTopic dunkyJsonTopic(){
        return TopicBuilder.name("dunkyJson_Topic")
                .build();
    }
}
