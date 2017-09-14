package com.avalon;

import com.avalon.bean.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class SpringBootTestApplicationTests {

	@Autowired
	private TestBean testBean;

	@Test
	public void contextLoads() {
		String expected = "from development profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected,actual);
	}

}
