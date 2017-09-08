package com.avalon;

import com.avalon.service.BeanWayService;
import com.avalon.service.JSR250WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringBootBeanApplication implements CommandLineRunner {

	@Autowired
	private BeanWayService beanWayService;

	@Resource
	private JSR250WayService jsr250WayService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeanApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		beanWayService.Sys();
	}
}
