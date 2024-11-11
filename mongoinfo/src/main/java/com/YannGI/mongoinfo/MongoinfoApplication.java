package com.YannGI.mongoinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MongoinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoinfoApplication.class, args);
	}

}
