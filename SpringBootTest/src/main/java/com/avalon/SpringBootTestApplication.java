package com.avalon;

import com.avalon.bean.TestValueBean;
import com.avalon.bean.TestValueLocalBean;
import com.avalon.test.annotation.Message;
import com.avalon.webservice.WebServiceWSDLController2;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.avalon.start.demo.service.HelloService;

import javax.xml.ws.Endpoint;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@EnableAspectJAutoProxy
public class SpringBootTestApplication {

	@Value("${test.name}")
	private String name;

	@Value("${test.password}")
	private String password;

	@Autowired
	private HelloService helloService;

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

	@RequestMapping("/encoding")
	public String encoding(String name){
		return "参数:"+name;
	}

	@Message()
	@RequestMapping("/getValue/{value}")
	public Map<String,String> getValue(@PathVariable String value){
		Map<String,String> map = new HashMap<>();
		map.put("value", Base64.encodeBase64URLSafeString(value.getBytes()));
		return map;
	}

	/**
	 * 获取配置的位于demo项目的自动加载数据
	 * @return
	 */
	@RequestMapping("/hello")
	public String getHello(){
		return helloService.sayHello();
	}

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootTestApplication.class, args);
		SpringApplication app = new SpringApplication();
		app.setBannerMode(Banner.Mode.LOG);
		app.run(SpringBootTestApplication.class,args);

		Endpoint.publish("http://localhost:9090/webservice/WebServiceWSDLController2",new WebServiceWSDLController2());
		System.out.println("service success");
	}
}
