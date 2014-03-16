package com.slgerkamp.designpattern.adapter.techscore;

public class Teacher{
	public static void main(String args[]){
		// 継承パターン
		Chairperson chairperson = new NewTaro();
		chairperson.organizeClass();

		// 委譲パターン
		Chairperson chairperson2 = new Hanako();
		chairperson2.organizeClass();
	}
}