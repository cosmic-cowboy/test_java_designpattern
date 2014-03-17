package com.slgerkamp.designpattern.decorator.techscore;

/**
 * デザインパターン 12章　Decorator パターン
 * http://www.techscore.com/tech/DesignPattern/Decorator.html/
 * 
 * デコレーションクラスの肝
 * 
 * デコレーション実装クラス
 * 「継承を利用した機能の追加」より固定的な実装にするのではなく、
 * コンストラクタを使って呼び出すことで柔軟性を担保している
 * VanillaIcecreamに対しても、GreenTeaIcecreamに対してもトッピングが可能
 * 
 */
public class CashewNutsToppingIcecream implements Icecream{

	private Icecream ice = null;

	/**
	 * @param ice
	 * 
	 * 引数にIcecreamを取ることでベースにしたいIcecreamを自由に選択することができる
	 * 継承ではないのでインスタンス生成時の選択の幅が広がり柔軟性があがる
	 * 
	 */
	public CashewNutsToppingIcecream(Icecream ice){
		this.ice = ice;
	}

	/* (非 Javadoc)
	 * @see com.slgerkamp.designpattern.decorator.techscore.Icecream#getName()
	 * 
	 * 追加する必要がある機能については変更を加える
	 */
	@Override
	public String getName(){
		String name = "カシューナッツ";
		name += ice.getName();
		return name;
	}

	/* (非 Javadoc)
	 * @see com.slgerkamp.designpattern.decorator.techscore.Icecream#howSweet()
	 * 
	 * 追加する必要がない機能については処理を委譲する
	 */
	@Override
	public String howSweet(){
		return ice.howSweet();
	}
}
