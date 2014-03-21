package com.slgerkamp.designpattern.visitor.techscore;

import java.util.ArrayList;
import java.util.List;

/**
 * デザインパターン 13章　Visitor パターン
 * http://www.techscore.com/tech/DesignPattern/Visitor.html/
 * 
 * 
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		// 家庭訪問をするTeacher
		List<Student> list = new ArrayList<Student>();
		list.add(new Student());
		Teacher teacher = new RookieTeacher(list);
		
		// 訪問先のお宅
		SuzukiHome suzukiHome = new SuzukiHome();
		suzukiHome.accept(teacher);
		
		
		
	}
}
