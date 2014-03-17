package com.slgerkamp.designpattern.decorator.techscore;


/**
 * デザインパターン 12章　Decorator パターン
 * http://www.techscore.com/tech/DesignPattern/Decorator.html/
 * 
 * Icecream 実装クラス
 * 
 */
public class GreenTeaIcecream implements Icecream{

	@Override
	public String getName(){
		return "抹茶アイスクリーム";
	}

	@Override
	public String howSweet(){
		return "抹茶味";
	}
}
