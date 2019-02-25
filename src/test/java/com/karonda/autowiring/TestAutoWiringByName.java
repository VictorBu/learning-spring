package com.karonda.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.karonda.autowiring.AutoWiringServiceByName;
import com.karonda.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiringByName extends UnitTestBase {
	
	public TestAutoWiringByName() {
		super("classpath:spring-autowiring-byname.xml");
	}
	
	@Test
	public void testSay() {
		AutoWiringServiceByName service = super.getBean("autoWiringService");
		service.say(" this is a test");
	}

}
