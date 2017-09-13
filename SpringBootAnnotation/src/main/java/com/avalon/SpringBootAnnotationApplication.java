package com.avalon;

import com.avalon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}

	@Autowired
	private DemoService demoService;

	@Override
	public void run(String... strings) throws Exception {
		demoService.outputResult();
	}
}
