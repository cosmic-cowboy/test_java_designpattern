package com.slgerkamp.designpattern.bridge.techscore;

import com.slgerkamp.designpattern.bridge.techscore.sortImple.SortImple;


/**
 * デザインパターン 9章　Bridge パターン
 * http://www.techscore.com/tech/DesignPattern/Bridge.html/
 * 
 * 機能を拡張するためのクラス階層
 * ソート機能に加えて、
 * ソートにかかった時間を表示する機能を提供する抽象クラス
 *
 */
public class TimerSorter extends Sorter{

	/**
	 * ソート機能がSortImpleに委譲されたことで
	 * TimerSorterでもソート機能のsort方法を選択可能に
	 * 
	 * @param sortImple
	 */
	public TimerSorter(SortImple sortImple) {
		super(sortImple);
	}

	public void timeSorter(Object[] obj) {

		long start = System.currentTimeMillis();
		sort(obj);
		long end = System.currentTimeMillis();
		System.out.println("time : " + (end - start));

	}
}
