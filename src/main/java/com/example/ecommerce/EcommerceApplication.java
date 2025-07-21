package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		System.out.println("🚀 App is starting...");
		SpringApplication.run(EcommerceApplication.class, args);
	}

//	@PostConstruct
//	public void loadEnv() {
//		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
//
//		System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
//		System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
//		System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
//		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
//		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
//	}
}
