package com.slgerkamp.designpattern.iterator.techscore;

import java.util.Vector;

public class NewVeteranStudentList implements Aggregate{

	private Vector<MyStudent> studentList;

	public NewVeteranStudentList() {
		super();
		studentList = new Vector<MyStudent>();
	}

	public void add(MyStudent student){
		studentList.add(student);
	}
	public MyStudent getStudentAd(int index){
		return studentList.get(index);
	}
	public int getLastNum() {
		return studentList.size();
	}
    
	@Override
	public Iterator iterator() {
		return new NewVeteranStudentListIterator(this);
	}
}
