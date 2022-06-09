package com.swapi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwapiEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiEurekaNamingServerApplication.class, args);
	}
}
