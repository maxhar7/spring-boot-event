package com.event.app;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import com.event.app.publisher.UserPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserPublisher userPublisher){
		return args -> {
			userPublisher.publishUserRegisteredEvent(new UserRegisteredEvent("Max", "1234", (byte) 37));
			userPublisher.publishUserValidatedEvent(new UserValidatedEvent("Max", "Event from init", true));
		};
	}
}
