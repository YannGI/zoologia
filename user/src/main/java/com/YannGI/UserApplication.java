package com.YannGI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//@ComponentScans({@ComponentScan("com.YannGI.utilisateur.controller")})
//@EnableJpaRepositories("com.YannGI.utilisateur.repository")
//@EntityScan("com.YannGI.utilisateur.model")
@EnableFeignClients
@SpringBootApplication
//@RefreshScope
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
