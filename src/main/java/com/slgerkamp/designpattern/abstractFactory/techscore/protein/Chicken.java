package com.slgerkamp.designpattern.abstractFactory.techscore.protein;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * 具象クラス
 * Factoryで利用する集約要素
 */
public class Chicken extends Protein {

	@Override
	public String getName() {
		return "鶏肉";
	}

}
