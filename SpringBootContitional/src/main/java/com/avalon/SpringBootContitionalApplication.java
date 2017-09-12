package com.avalon;

import com.avalon.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootContitionalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootContitionalApplication.class, args);
	}

	@Autowired
	private ListService listService;

	@Override
	public void run(String... strings) throws Exception {

		System.out.println((new AnnotationConfigApplicationContext()).getEnvironment().getProperty("os.name")
				+"系统下的列表命令是:"+
				listService.showListCmd());
	}
}
