package com.karonda.ioc.interfaces;


import com.karonda.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface(){
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello(){
        OneInterface oif = super.getBean("oneInterface");
        System.out.println(oif.hello("world"));
    }
}
