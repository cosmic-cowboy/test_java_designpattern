package com.slgerkamp.designpattern.iterator.techscore;

public class VeteranTeacher extends Teacher{

	protected NewVeteranStudentList studentList;

	@Override
	public void createStudentList() {
		studentList = new NewVeteranStudentList();
		studentList.add(new MyStudent("中川雄介",1));
		studentList.add(new MyStudent("板東恵美",2));
		studentList.add(new MyStudent("水島太郎",1));
	}
	@Override
	public void callStudents() {
		Iterator itr = studentList.iterator();
		while(itr.hasNext()){
			System.out.println(((MyStudent)itr.next()).toString());
		}		
	}
}