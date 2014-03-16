package com.slgerkamp.designpattern.iterator.techscore;

public class Main {
	public static void main(String args[]){
	    Teacher you = new MyTeacher();
	    you.createStudentList();
	    you.callStudents();

	    System.out.println();
	    
	    Teacher veteran = new VeteranTeacher();
	    veteran.createStudentList();
	    veteran.callStudents();
	
	}
}
