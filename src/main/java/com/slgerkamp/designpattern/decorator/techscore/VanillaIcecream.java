package com.slgerkamp.designpattern.decorator.techscore;

/**
 * デザインパターン 12章　Decorator パターン
 * http://www.techscore.com/tech/DesignPattern/Decorator.html/
 * 
 * Icecream 実装クラス
 * 
 */
public class VanillaIcecream implements Icecream{

	@Override
	public String getName(){
		return "バニラアイスクリーム";
	}
	
	@Override
	public String howSweet() {
		return "バニラ味";
	}
}