package YannGI.example.z_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZEurekaserverApplication.class, args);
	}

}
