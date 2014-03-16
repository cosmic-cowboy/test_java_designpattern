package com.slgerkamp.designpattern.bridge.techscore.sortImple;

/**
 * デザインパターン 9章　Bridge パターン
 * http://www.techscore.com/tech/DesignPattern/Bridge.html/
 * 
 * ソート機能の実装を拡張するためのクラス階層
 * 実装の変更が考えられるメソッドを持つクラス用の抽象クラス
 * Sorterクラスよりソート機能を委譲される
 * 
 */
public abstract class SortImple {

	public void sort(Object[] obj) {}

}
