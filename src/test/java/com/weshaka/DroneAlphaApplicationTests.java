package com.weshaka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.weshaka.DroneAlphaApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DroneAlphaApplication.class)
@WebAppConfiguration
public class DroneAlphaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
