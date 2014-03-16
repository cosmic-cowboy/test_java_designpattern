package com.slgerkamp.designpattern.abstractFactory.techscore;

import com.slgerkamp.designpattern.abstractFactory.techscore.factory.Factory;
import com.slgerkamp.designpattern.abstractFactory.techscore.factory.IshikariNabe;
import com.slgerkamp.designpattern.abstractFactory.techscore.factory.MizutakiFactory;
import com.slgerkamp.designpattern.abstractFactory.techscore.factory.SukiyakiFactory;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * abstractFactoryの実行クラス
 *
 */
public class Main {
	public static void main(String[] args) {
		// 集約オブジェクトの生成
		HotPot hotpot = new HotPot(new Pot());
		
		// 水炊きに必要な材料を生成
		Factory factory = createFactory("水炊き");

		// 鍋に入れていく
		// スープは鶏ガラ
		hotpot.addSoup(factory.getSoup());
		// メイン
		hotpot.addMain(factory.getProtein());
		// 野菜
		hotpot.addVegetables(factory.getVegetables());
		// その他
		hotpot.addOtherIngredients(factory.getOtherIngredients());	
		hotpot.eat();
	}

	private static Factory createFactory(String hotpot) {
		if(hotpot.equals("石狩鍋")){
			return new IshikariNabe();
		}else if(hotpot.equals("すき焼き")){
			return new SukiyakiFactory();			
		}else {
			return new MizutakiFactory();
		}
	}
}
