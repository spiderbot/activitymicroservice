package com.piyush.joshi.socialmedia.activitymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.piyush.joshi.socialmedia.activitymicroservice")
public class ActivitymicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitymicroserviceApplication.class, args);
	}

}
