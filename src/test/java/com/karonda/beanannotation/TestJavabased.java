package com.karonda.beanannotation;

import com.karonda.base.UnitTestBase;
import com.karonda.beanannotation.javabased.MyDriverManager;
import com.karonda.beanannotation.javabased.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {
	
	public TestJavabased() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void test() {
		Store store = super.getBean("stringStore");
		System.out.println(store.getClass().getName());
	}


	@Test
	public void testMyDriverManager() {
		MyDriverManager manager = super.getBean("myDriverManager");
		System.out.println(manager.getClass().getName());
	}
	
}
