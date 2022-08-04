package com.kata.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		openHomePage();
	}

	private static void openHomePage() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080/users");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
