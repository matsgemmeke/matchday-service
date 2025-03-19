package nl.matsgemmeke.matchday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration;

@SpringBootApplication(exclude = WebServicesAutoConfiguration.class)
public class MatchdayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchdayServiceApplication.class, args);
	}

}
