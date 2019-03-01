package com.karonda.beanannotation;

import com.karonda.base.UnitTestBase;
import com.karonda.beanannotation.injection.service.InjectionService;
import com.karonda.beanannotation.multibean.BeanInvoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired(){
        InjectionService service = super.getBean("injectionServiceImpl");

        service.save("This is autowired.");
    }

    @Test
    public void testMultiBean(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }

}
