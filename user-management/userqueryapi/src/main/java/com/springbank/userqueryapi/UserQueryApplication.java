package com.springbank.userqueryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.springbank.usercore.configuration.AxonConfig;

@SpringBootApplication
@Import({AxonConfig.class})
public class UserQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserQueryApplication.class, args);
	}

}
