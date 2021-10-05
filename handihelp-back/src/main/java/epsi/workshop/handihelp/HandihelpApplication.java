package epsi.workshop.handihelp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HandihelpApplication {
	@Autowired
	private MainService mainService;
	public static void main(String[] args) {
		SpringApplication.run(HandihelpApplication.class, args);
	}

	@Bean
	public void loadData() {
		mainService.loadData();
	}

}
