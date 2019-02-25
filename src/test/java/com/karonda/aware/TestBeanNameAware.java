package com.karonda.aware;

import com.karonda.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanNameAware extends UnitTestBase {

	public TestBeanNameAware() {
		super("classpath:spring-aware-beanname.xml");
	}
	
	@Test
	public void textMoocBeanName() {
		System.out.println("textMoocBeanName : " + super.getBean("moocBeanName").hashCode());
	}
	
}
