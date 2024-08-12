package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.CitizenService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		CitizenService citizen = context.getBean(CitizenService.class);
		
		citizen.saveCitizenRecord();
	}

}
