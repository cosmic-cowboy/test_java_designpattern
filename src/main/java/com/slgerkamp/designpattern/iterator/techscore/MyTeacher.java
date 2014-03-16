package com.slgerkamp.designpattern.iterator.techscore;

public class MyTeacher extends Teacher {

	private MyStudentList studentList;

	@Override
	public void createStudentList() {
		studentList = new MyStudentList(5);
		
		studentList.add(new MyStudent("赤井亮太", 1));
		studentList.add(new MyStudent("赤羽里美", 2));
		studentList.add(new MyStudent("岡田美央", 2));
		studentList.add(new MyStudent("西森俊介", 1));
		studentList.add(new MyStudent("中ノ森玲菜", 2));
	}

	@Override
	public void callStudents() {
		Iterator iterator = studentList.iterator();
		while (iterator.hasNext()) {
			MyStudent s = (MyStudent) iterator.next();
			System.out.println(s.toString());			
		}
	}

}
