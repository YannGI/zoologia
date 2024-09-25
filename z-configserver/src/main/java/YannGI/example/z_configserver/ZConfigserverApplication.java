package YannGI.example.z_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZConfigserverApplication.class, args);
	}

}
