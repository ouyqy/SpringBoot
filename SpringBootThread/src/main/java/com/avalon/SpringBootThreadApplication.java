package com.avalon;

import com.avalon.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootThreadApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThreadApplication.class, args);
	}

	@Autowired
	private AsyncTaskService asyncTaskService;

	@Override
	public void run(String... strings) throws Exception {

		for(int i = 0;i<10;i++){
			asyncTaskService.executorAsyncTask(i);
			asyncTaskService.executorAsyncTaskPlus(i);
		}
	}
}
