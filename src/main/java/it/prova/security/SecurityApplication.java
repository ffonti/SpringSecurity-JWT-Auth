package it.prova.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SecurityApplication {

	private static Environment env;

	public SecurityApplication(Environment env) {
		SecurityApplication.env = env;
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
		System.out.println("Server listening on port " + env.getProperty("server.port"));
	}

}
