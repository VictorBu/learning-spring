package com.karonda.autowiring;

public class AutoWiringServiceByType {
	
	private AutoWiringDAO autoWiringDAO;

	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
