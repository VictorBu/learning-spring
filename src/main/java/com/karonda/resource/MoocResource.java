package com.karonda.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


public class MoocResource implements ApplicationContextAware  {
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
		//Resource resource = applicationContext.getResource("classpath:config.txt");
		//Resource resource = applicationContext.getResource("file:E:\\project\\java\\demo\\learningspring\\src\\main\\resources\\config.txt");
		//Resource resource = applicationContext.getResource("https://www.cnblogs.com/victorbu/p/10430698.html");
		//Resource resource = applicationContext.getResource("config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
