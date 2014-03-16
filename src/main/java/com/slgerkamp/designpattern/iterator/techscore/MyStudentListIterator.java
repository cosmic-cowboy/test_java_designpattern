package com.slgerkamp.designpattern.iterator.techscore;

/**
 * 集約体を操作するための具象クラス
 * 集約体により、hasNext(), next()の実装を整える
 * 
 * ここでは操作する集約体を宣言し、Aggregateクラスのiteratorメソッドにより生成する
 * このコンストラクタはMyStudentListからしか呼び出されてはいけない
 * 呼び出しクラスを判定したいくらい
 */
public class MyStudentListIterator implements Iterator {

	private final MyStudentList myStudentList;
	
	private int index;

	public MyStudentListIterator(MyStudentList myStudentList) {
		this.myStudentList = myStudentList;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < myStudentList.getLastNum();
	}

	@Override
	public Object next() {
		Student s = myStudentList.getStudentAt(index);
		index++;
		return s;
	}

}
