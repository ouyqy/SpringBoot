package com.avalon;

import com.avalon.bean.TestValueBean;
import com.avalon.bean.TestValueLocalBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTestApplication {

	@Value("${test.name}")
	private String name;

	@Value("${test.password}")
	private String password;

	@Autowired
	private TestValueBean testValueBean;

	@Autowired
	private TestValueLocalBean testValueLocalBean;

	@RequestMapping("/index")
	public String index(){
		return name + "--" + password;
	}

	@RequestMapping("/indexValue")
	public String indexValue(){
		return testValueBean.getName() + "::"+testValueBean.getPassword();
	}

	@RequestMapping("/indexValueLocal")
	public String indexValueLocal(){
		return testValueLocalBean.getName()+"::"+testValueLocalBean.getEmail();
	}

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootTestApplication.class, args);
		SpringApplication app = new SpringApplication();
		app.setBannerMode(Banner.Mode.LOG);
		app.run(SpringBootTestApplication.class,args);
	}
}
