package com.karonda.beanannotation.javabased;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")// 如果没有指定 name，那么name 为 方法的名称
	public StringStore stringStore() {
		return new StringStore();
	}

}
