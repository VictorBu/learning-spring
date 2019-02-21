package com.karonda.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.karonda.bean.BeanScope;
import com.karonda.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScopeSingleton extends UnitTestBase {
	
	public TestBeanScopeSingleton() {
		super("classpath*:spring-beanscope-singleton.xml");
	}
	
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}
	
	@Test
	public void testSay2() {
		BeanScope beanScope  = super.getBean("beanScope");
		beanScope.say();
	}

	/*
		testSay 与 testSay2 的输出不一致，这是因为 UnitTestBase 在执行每个方法都会执行 Before 和 After 方法
		Before 和 After 方法每次都会新建和销毁容器，所以 testSay 与 testSay2 属于两个容器
	*/

}
