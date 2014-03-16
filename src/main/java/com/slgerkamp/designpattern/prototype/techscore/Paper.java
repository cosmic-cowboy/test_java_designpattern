package com.slgerkamp.designpattern.prototype.techscore;

public class Paper implements Cloneable{

	private String name;

	private Paper(){
		
	}
	public Paper(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	
	
	@Override
	public Cloneable createClone() {
		
		Paper newPaper = new Paper();
		newPaper.name  = this.name;
		return newPaper;
	}

}
