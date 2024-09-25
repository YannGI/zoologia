package YannGI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ZWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZWebappApplication.class, args);
	}

}
