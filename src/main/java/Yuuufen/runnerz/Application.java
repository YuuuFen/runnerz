package Yuuufen.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		// Retrieve WelcomeMessage bean from Spring context
		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");

		// Call getWelcomeMessage() method and print its return value
		System.out.println(welcomeMessage.getWelcomeMessage());

	}

}
