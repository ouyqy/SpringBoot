package com.avalon;

import com.avalon.Bean.AwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.avalon")
public class SpringBootAwareApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwareApplication.class, args);
	}

	@Autowired
	private AwareService awareService;

	@Override
	public void run(String... strings) throws Exception {
		awareService.outputResult();
	}
}
