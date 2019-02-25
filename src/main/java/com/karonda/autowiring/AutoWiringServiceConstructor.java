package com.karonda.autowiring;

public class AutoWiringServiceConstructor {
	
	private AutoWiringDAO autoWiringDAO;

	public AutoWiringServiceConstructor(AutoWiringDAO autoWiringDAO){
		this.autoWiringDAO = autoWiringDAO;
	}
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
