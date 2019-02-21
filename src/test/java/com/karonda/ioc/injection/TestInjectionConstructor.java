package com.karonda.ioc.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.karonda.ioc.injection.service.InjectionService;
import com.karonda.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjectionConstructor extends UnitTestBase {
	
	public TestInjectionConstructor() {
		super("classpath:spring-injection-constructor.xml");
	}

	
	@Test
	public void testCons() {
		InjectionService service = super.getBean("injectionService");
		service.save("这是要保存的数据");
	}
	
}
