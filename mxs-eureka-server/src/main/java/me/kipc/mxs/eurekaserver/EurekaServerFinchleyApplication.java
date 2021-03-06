package me.kipc.mxs.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
@EnableEurekaServer
public class EurekaServerFinchleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerFinchleyApplication.class, args);
	}
}
