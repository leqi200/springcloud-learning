package com.example.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description
 *
 * @author Qi
 * @date 2020年3月10日 下午1:57:50
**/
@EnableEurekaServer
@SpringBootApplication
public class Run {
	
	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}

}
