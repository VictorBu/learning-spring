package com.karonda.ioc.injection;

import com.karonda.base.UnitTestBase;
import com.karonda.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjectionProperty extends UnitTestBase {

	public TestInjectionProperty() {
		super("classpath:spring-injection-property.xml");
	}
	
	@Test
	public void testSetter() {
		InjectionService service = super.getBean("injectionService");
		service.save("这是要保存的数据");
	}
	
}
