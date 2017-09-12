package com.avalon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootScheduleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScheduleApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
