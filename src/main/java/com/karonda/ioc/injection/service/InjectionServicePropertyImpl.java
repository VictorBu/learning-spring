package com.karonda.ioc.injection.service;

import com.karonda.ioc.injection.dao.InjectionDAO;


public class InjectionServicePropertyImpl implements InjectionService {

	private InjectionDAO injectionDAO;
	
	//设值注入
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service(Property)接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
	
}
