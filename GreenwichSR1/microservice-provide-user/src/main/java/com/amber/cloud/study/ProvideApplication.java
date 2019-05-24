package com.amber.cloud.study;

import com.amber.cloud.study.bean.User;
import com.amber.cloud.study.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class ProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            User user1 = new User(1L, "account1", "amber", 20);
            User user2 = new User(2L, "account2", "eric", 28);
            User user3 = new User(3L, "account3", "hellen", 32);
            Stream.of(user1, user2, user3)
                    .forEach(repository::save);
        };
    }
}
