package com.slgerkamp.designpattern.builder.techscore;

/**
 * デザインパターン 7章　Builder パターン
 * http://www.techscore.com/tech/DesignPattern/Builder.html/
 * 
 * 目的：同じ作成過程で異なる表現形式の結果を得る
 *「作成過程」を決定する Director 
 *「表現形式」を決定する Builder
 * を組み合わせることで、オブジェクトの生成をより柔軟にし、そのオブジェクトの「作成過程」をもコントロール
 * 
 */
public class Main {

	public static void main(String[] args) {
		Builder builder = new SaltWaterBuilder();
		Director dir = new Director( builder );
		dir.constract();
		SaltWater saltWater = (SaltWater)builder.getResult();
		System.out.println("合計 :" + saltWater.getAmount());
		System.out.println("塩 :" + saltWater.salt);
		System.out.println("水 :" + saltWater.water);
	}

}
