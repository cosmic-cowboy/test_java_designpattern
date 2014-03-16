package com.slgerkamp.designpattern.prototype.techscore;

public class Main {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Paper[] crystals = teacher.createManyCrystals();
		for(Paper p : crystals) System.out.print(p.getName() + ", ");
	}
}
