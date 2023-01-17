package com.yatin.app;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FlightAware1Application {

	public static void main(String[] args) {
		SpringApplication.run(FlightAware1Application.class, args);
	}

}