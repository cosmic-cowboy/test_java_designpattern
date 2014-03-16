package com.slgerkamp.designpattern.iterator.techscore;

public class MyStudent extends Student {

	public MyStudent(String name, int sex) {
		super(name, sex);
	}
	
	public String toString(){
		return this.name + " " + sexName(this.sex);
	}

	private String sexName(int sex){
		String sexName = "男";
		if(sex == 2){
			sexName = "女";
		}
		return sexName;
	}
}
