package com.karonda.autowiring;

import com.karonda.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiringByType extends UnitTestBase {

	public TestAutoWiringByType() {
		super("classpath:spring-autowiring-bytype.xml");
	}
	
	@Test
	public void testSay() {
		AutoWiringServiceByType service = super.getBean("autoWiringService");
		service.say(" this is a test");
	}

}
