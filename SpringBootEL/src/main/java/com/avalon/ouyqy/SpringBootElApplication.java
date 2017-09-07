package com.avalon.ouyqy;

import com.avalon.ouyqy.el.ElConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringBootElApplication implements CommandLineRunner{

	@Resource
	public ElConfig elConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		elConfig.outputResource();
	}
}
