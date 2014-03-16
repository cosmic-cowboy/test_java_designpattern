package com.slgerkamp.designpattern.bridge.techscore;

import com.slgerkamp.designpattern.bridge.techscore.sortImple.SortImple;


/**
 * デザインパターン 9章　Bridge パターン
 * http://www.techscore.com/tech/DesignPattern/Bridge.html/
 * 
 * 機能を拡張するためのクラス階層
 * ソート機能を提供するクラス
 * 実装の変更が考えられるメソッドは実装用のクラス階層に委譲
 * コンストラクタを利用し、sort方法を呼び出し側で選べるようにする
 * 
 */
public class Sorter{

	// sort方法を委譲したSortImple
	private SortImple sortImple;

	/**
	 * Sorterクラスと SortImpleクラスが機能拡張クラス階層と実装拡張クラス階層を橋渡し
	 * コンストラクタを利用し、sort方法を選択
	 * @param sortImple
	 */
	public Sorter(SortImple sortImple) {
		this.sortImple = sortImple;
	}

	// sortをするためのインタフェースは提供する
	// sort方法はコンストラクタで選択
	// SortImpleに委譲されている
	public void sort(Object[] obj){
		sortImple.sort(obj);
	};
}