package com.karonda.beanannotation.javabased;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

//	@Value("${jdbc.url}")
//	private String url;
//
//	@Value("${jdbc.username}")
//	private String username;
//
//	@Value("${jdbc.password}")
//	private String password;
//
//	@Bean
//	public MyDriverManager myDriverManager(){
//		return new MyDriverManager(url, username, password);
//	}


//	@Bean(initMethod = "init", destroyMethod = "destroy")// 如果没有指定 name，那么name 为 方法的名称
//	public StringStore stringStore() {
//		return new StringStore();
//	}

	@Autowired
	@Qualifier(value="stringStore")
	private Store<String> s1;

	@Autowired
	@Qualifier(value="integerStore")
	private Store<Integer> s2;


	@Bean
	public StringStore stringStore() {
		return new StringStore();
	}
	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}

	@Bean
	public StringStore stringStoreTest(){
		System.out.println("s1: " + s1.getClass().getName());
		System.out.println("s2: " + s2.getClass().getName());
		return new StringStore();
	}
}
