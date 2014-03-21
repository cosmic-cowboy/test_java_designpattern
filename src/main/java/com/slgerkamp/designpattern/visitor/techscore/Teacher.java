package com.slgerkamp.designpattern.visitor.techscore;

import java.util.List;

/**
 * デザインパターン 13章　Visitor パターン
 * http://www.techscore.com/tech/DesignPattern/Visitor.html/
 * 
 * 
 * 
 */
public abstract class Teacher {
	List<Student> students;
	

	public Teacher(List<Student> students) {
		this.students = students;
	}

	public abstract void visit(Home studentHome);

	public abstract void visit(TanakaHome studentHome);

	public abstract void visit(SuzukiHome studentHome);
	
	public List<Student> getStudents() {
		return students;
	}
	
}
