package com.jdbctemplate.jdbctemplate;

import com.jdbctemplate.jdbctemplate.Connector.DBConnector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class JdbctemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplateApplication.class, args);

	}

}

