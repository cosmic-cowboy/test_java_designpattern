package com.slgerkamp.designpattern.bridge.techscore.sortImple;


/**
 * デザインパターン 9章　Bridge パターン
 * http://www.techscore.com/tech/DesignPattern/Bridge.html/
 * 
 * ソート機能の実装を拡張するためのクラス階層
 * ソート機能を委譲されたSortImpleを継承した具象クラス
 * クイックソートを提供する
 * 
 */
public class QuickSorter extends SortImple{

	@Override
	public void sort(Object[] obj) {
		for(Object o : obj) o.toString();
	}
}