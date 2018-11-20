package com.suhoff.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.map.repository.config.EnableMapRepositories;

/**
 * Created by Valeriy Suhotskiy <suhotskiy@gmail.com> on 20.11.18.
 */
@Configuration
//@EnableHazelcastRepositories("com.suhoff.example")
@EnableMapRepositories("com.suhoff.example")
public class AppConfig {
/*
    @Bean
    HazelcastInstance hazelcastInstance() {
        return Hazelcast.newHazelcastInstance();
    }

    @Bean
    public KeyValueOperations keyValueTemplate() {
        return new KeyValueTemplate(new HazelcastKeyValueAdapter(hazelcastInstance()));
    }

    @Bean
    public HazelcastKeyValueAdapter hazelcastKeyValueAdapter(HazelcastInstance hazelcastInstance) {
        return new HazelcastKeyValueAdapter(hazelcastInstance);
    }
*/
}
