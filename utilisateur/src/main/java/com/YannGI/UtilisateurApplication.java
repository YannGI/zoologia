package com.YannGI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.openfeign.EnableFeignClients;
//@ComponentScans({@ComponentScan("com.YannGI.utilisateur.controller")})
//@EnableJpaRepositories("com.YannGI.utilisateur.repository")
//@EntityScan("com.YannGI.utilisateur.model")
@EnableFeignClients
@SpringBootApplication
//@RefreshScope
public class UtilisateurApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilisateurApplication.class, args);
	}

}
