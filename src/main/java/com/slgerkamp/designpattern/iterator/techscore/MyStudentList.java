package com.slgerkamp.designpattern.iterator.techscore;


/**
 * 集約体 具象クラス
 * 
 * 集約体はかならずこのインタフェースを実装する
 * 集約体って配列とかCollectionを含むオブジェクトってこと？
 * ここに入るのって配列とかリストなので結局集約体を包んでいるだけなんだよね
 */
public class MyStudentList extends StudentList implements Aggregate {

	public MyStudentList(int studentCount) {
		super(studentCount);
	}

	@Override
	public Iterator iterator() {
		return new MyStudentListIterator(this);
	}

}
