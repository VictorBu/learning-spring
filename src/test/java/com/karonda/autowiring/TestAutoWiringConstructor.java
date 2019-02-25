package com.karonda.autowiring;

import com.karonda.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiringConstructor extends UnitTestBase {

	public TestAutoWiringConstructor() {
		super("classpath:spring-autowiring-constructor.xml");
	}
	
	@Test
	public void testSay() {
		AutoWiringServiceConstructor service = super.getBean("autoWiringService");
		service.say(" this is a test");
	}

}
