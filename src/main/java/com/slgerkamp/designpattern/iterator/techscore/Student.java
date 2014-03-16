package com.slgerkamp.designpattern.iterator.techscore;

/**
 * 参考：Iteratorパターン
 * http://www.techscore.com/tech/DesignPattern/Iterator/Iterator1.html/
 * 
 */
public class Student {

	// 値オブジェクトにしたいのでfinal
	protected final String name;
	protected final int sex;

	// コンストラクタで初期化した値は変更されることはない「参照のみ」
	public Student(String name, int sex) {
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public int getSex() {
		return sex;
	}
	
}
