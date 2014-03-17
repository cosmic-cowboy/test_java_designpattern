package com.slgerkamp.designpattern.decorator.techscore;

/**
 * デザインパターン 12章　Decorator パターン
 * http://www.techscore.com/tech/DesignPattern/Decorator.html/
 * 
 * VanillaIcecream 継承クラス
 * 「継承を利用した機能の追加」より実装は固定的なものになる
 * GreenTeaIcecreamへのトッピングができない
 * 
 */
public class CashewNutsVanillaIcecream extends VanillaIcecream{

	/* (非 Javadoc)
	 * @see com.slgerkamp.designpattern.decorator.techscore.VanillaIcecream#getName()
	 * 
	 * 実装クラスVanillaIcecreamを継承することで
	 * 追加する必要がある機能を実装
	 * 
	 */
	@Override
	public String getName(){
		return "カシューナッツバニラアイスクリーム";
	}
}