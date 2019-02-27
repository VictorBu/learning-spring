package com.karonda.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.karonda.beanannotation.BeanAnnotation;
import com.karonda.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	
	public TestBeanAnnotation() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay() {
		// BeanAnnotation bean = super.getBean("bean");
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.say("This is test.");
	}
	
	@Test
	public void testScpoe() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();
		
		bean = super.getBean("beanAnnotation");
		bean.myHashCode();
	}
	
}
