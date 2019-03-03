package com.karonda.beanannotation.javabased;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Bean
	public MyDriverManager myDriverManager(){
		return new MyDriverManager(url, username, password);
	}


//	@Bean(initMethod = "init", destroyMethod = "destroy")// 如果没有指定 name，那么name 为 方法的名称
//	public StringStore stringStore() {
//		return new StringStore();
//	}

}
