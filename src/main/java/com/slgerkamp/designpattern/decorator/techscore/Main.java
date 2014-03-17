package com.slgerkamp.designpattern.decorator.techscore;

/**
 * デザインパターン 12章　Decorator パターン
 * http://www.techscore.com/tech/DesignPattern/Decorator.html/
 * 
 * 飾り枠と中身を同一視することで、より柔軟な機能拡張方法を提供
 * 機能を一つひとつかぶせていくイメージ
 * ある機能を持ったDecorationをコアとなるものにかぶせていくイメージ  
 * 
 */
public class Main {
	public static void main(String[] args) {

		// バニラアイスを注文
		System.out.println(new VanillaIcecream().getName());

		// 抹茶アイスを注文
		System.out.println(new GreenTeaIcecream().getName());

		// カシュナッツ入りバニラアイスを注文
		System.out.println(new CashewNutsVanillaIcecream().getName());

		// 以下、デコレーションパターンの肝
		// バニラアイスを注文し、カシュナッツをトッピングする
		System.out.println(new CashewNutsToppingIcecream(new VanillaIcecream()).getName());

		// 抹茶アイスを注文し、カシュナッツをトッピングする
		System.out.println(new CashewNutsToppingIcecream(new GreenTeaIcecream()).getName());
	}
}
