package com.springbank.bankaccqueryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.springbank.bankacccore.configuration.AxonConfig;

@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import(AxonConfig.class)
public class BankaccQueryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankaccQueryApiApplication.class, args);
	}

}
