/**
 * http://www.nulab.co.jp/designPatterns/designPatterns2/designPatterns2-4.html
 * を写経
 */
package com.slgerkamp.designpattern.composite.nulab;

/**
 * すべての要素の基本となる抽象クラスです。
 */
public abstract class Order {

	/*
	 * 注文を追加します。
	 */
	public void addOrder(Order order) {
	}
	
	/*
	 * 料金を集計する抽象メソッドです。
	 */
	public abstract int getAmount();
}
