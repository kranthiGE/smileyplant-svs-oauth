package com.ge.predix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.iot.SmileyPlantApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SmileyPlantApplication.class)
@WebAppConfiguration
public class PredixSharedUaaSpringBootWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
