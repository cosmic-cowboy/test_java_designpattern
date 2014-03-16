package com.slgerkamp.designpattern.abstractFactory.techscore.ingredients;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * 具象クラス
 * Factoryで利用する集約要素
 */
public class Tofu extends Ingredients {

	@Override
	public String getName() {
		return "豆腐";
	}

}
