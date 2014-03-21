package com.slgerkamp.designpattern.visitor.techscore;


/**
 * デザインパターン 13章　Visitor パターン
 * http://www.techscore.com/tech/DesignPattern/Visitor.html/
 * 
 * 
 * 
 */
public class SuzukiHome extends Home implements TeacherAccepter {

	@Override
	public Object praisedChild() {
		System.out.println("あら、先生ったらご冗談を");
		return new Tea();
	}

	@Override
	public Object reprovedChild() {
		System.out.println("うちの子に限ってそんなことは・・・。");
		return null;
	}

	@Override
	public void accept(Teacher teacher) {
		teacher.visit(this);
	}

}
