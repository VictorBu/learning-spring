package com.karonda.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.karonda.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestApplicationContextAware extends UnitTestBase {
	
	public TestApplicationContextAware() {
		super("classpath:spring-aware-applicationcontext.xml");
	}
	
	@Test
	public void testMoocApplicationContext() {
		System.out.println("testMoocApplicationContext : " + super.getBean("moocApplicationContext").hashCode());
	}

}
