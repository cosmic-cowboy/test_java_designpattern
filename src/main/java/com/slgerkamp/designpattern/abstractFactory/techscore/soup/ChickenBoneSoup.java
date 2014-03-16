package com.slgerkamp.designpattern.abstractFactory.techscore.soup;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * 具象クラス
 * Factoryで利用する集約要素
 */
public class ChickenBoneSoup extends Soup {

	@Override
	public String getName() {
		return "チキンスープ";
	}

}
