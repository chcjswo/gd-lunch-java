package me.mocadev.lunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@SpringBootApplication
public class LunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LunchApplication.class, args);
	}

}
