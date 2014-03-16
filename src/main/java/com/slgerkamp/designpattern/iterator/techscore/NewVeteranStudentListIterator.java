package com.slgerkamp.designpattern.iterator.techscore;

public class NewVeteranStudentListIterator implements Iterator {

	private final NewVeteranStudentList myStudentList;

	private int index;
	public NewVeteranStudentListIterator(NewVeteranStudentList myStudentList) {
		this.myStudentList = myStudentList;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO 自動生成されたメソッド・スタブ

		return index < myStudentList.getLastNum();
	}

	@Override
	public Object next() {
		Student s = myStudentList.getStudentAd(index);
		index++;
		return s;
	}

}
