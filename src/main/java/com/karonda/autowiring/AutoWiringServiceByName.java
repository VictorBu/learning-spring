package com.karonda.autowiring;

public class AutoWiringServiceByName {
	
	private AutoWiringDAO autoWiringDAO;

	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
