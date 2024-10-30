package com.YannGI.appandcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppandcardApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(AppandcardApplication.class, args);
	}
}
