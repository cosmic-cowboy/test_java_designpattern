package com.slgerkamp.designpattern.visitor.techscore;

/**
 * デザインパターン 13章　Visitor パターン
 * http://www.techscore.com/tech/DesignPattern/Visitor.html/
 * 
 * 
 * 
 */
public class TanakaHome extends Home implements TeacherAccepter {

	@Override
	public void accept(Teacher teacher) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Object praisedChild() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Object reprovedChild() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
