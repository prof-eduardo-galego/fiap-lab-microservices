package fiap.lab.microservices.deliveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeliveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryServerApplication.class, args);
	}
}
