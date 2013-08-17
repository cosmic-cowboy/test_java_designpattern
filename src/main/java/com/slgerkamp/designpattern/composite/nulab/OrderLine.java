/**
 * http://www.nulab.co.jp/designPatterns/designPatterns2/designPatterns2-4.html
 * を写経
 */
package com.slgerkamp.designpattern.composite.nulab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 注文をまとめるクラスです。
 */
public class OrderLine extends Order {

	/* このクラスで管理する注文および商品のリストです。 */
	private List<Order> orders = new ArrayList<Order>();

	/*
	 * 商品や注文を追加します。
	 */
	public void addOrder(Order order) {
		orders.add(order);
	}
		
	/*
	 * 管理する注文や商品の値段を返します。
	 */
	public int getAmount() {
		int result = 0;
		
		for (Iterator<Order> itr = orders.iterator(); itr.hasNext();) {
			Order order = itr.next();
			result += order.getAmount();
		}
		
		return result;
	}
}
