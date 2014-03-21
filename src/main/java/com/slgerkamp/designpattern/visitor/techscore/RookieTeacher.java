package com.slgerkamp.designpattern.visitor.techscore;

import java.util.List;

/**
 * デザインパターン 13章　Visitor パターン
 * http://www.techscore.com/tech/DesignPattern/Visitor.html/
 * 
 * 
 * 
 */
public class RookieTeacher extends Teacher{

	public RookieTeacher(List<Student> students) {
		super(students);
	}

	@Override
	public void visit(Home studentHome) {
		System.out.println("こんにちは");		
	}

	@Override
	public void visit(TanakaHome studentHome) {
		studentHome.praisedChild();		
	}

	@Override
	public void visit(SuzukiHome studentHome) {
		studentHome.reprovedChild();
	}

}
