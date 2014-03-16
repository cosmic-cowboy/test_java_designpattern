package com.slgerkamp.designpattern.builder.techscore;


/**
 * デザインパターン 7章　Builder パターン
 * http://www.techscore.com/tech/DesignPattern/Builder.html/
 * 
 * 生成されるオブジェクト
 *  
 */
public class SaltWater {
	public double salt;
	public double water;

	public SaltWater(double salt, double water) {
		super();
		this.salt = salt;
		this.water = water;
	}
	
	public double getAmount(){
		return this.salt + this.water;
	}
}
