package com.swapi.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SwapiCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiCloudConfigServerApplication.class, args);
	}
}
