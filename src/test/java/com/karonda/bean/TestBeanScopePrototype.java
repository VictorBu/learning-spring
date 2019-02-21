package com.karonda.bean;

import com.karonda.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScopePrototype extends UnitTestBase {

	public TestBeanScopePrototype() {
		super("classpath*:spring-beanscope-prototype.xml");
	}
	
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();

		beanScope = super.getBean("beanScope");
		beanScope.say();
	}

}
