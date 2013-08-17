/**
 * http://www.nulab.co.jp/designPatterns/designPatterns2/designPatterns2-4.html
 * を写経
 */
package com.slgerkamp.designpattern.composite.nulab;

/**
 * 商品クラスです。
 */
public class OrderItem extends Order {

	/* 商品の値段です。 */
	private int price;

	/*
	 * 値段を渡してクラスを初期化します。
	 */
	public OrderItem(int price) {
		this.price = price;
	}
		
	/*
	 * この商品の値段を返します。
	 */
	public int getAmount() {
		return this.price;
	}
}
