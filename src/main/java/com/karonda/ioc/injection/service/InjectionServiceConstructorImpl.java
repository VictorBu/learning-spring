package com.karonda.ioc.injection.service;

import com.karonda.ioc.injection.dao.InjectionDAO;


public class InjectionServiceConstructorImpl implements InjectionService {
	
	private InjectionDAO injectionDAO;
	
	//构造器注入
	public InjectionServiceConstructorImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service(Constructor)接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
	
}
