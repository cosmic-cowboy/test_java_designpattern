package com.slgerkamp.designpattern.chainOfResponsibility.techscore;

/**
 * <p>デザインパターン 14章　Chain of Responsibility パターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/ChainOfResponsibility.html/</p>
 * 
 * <p>課題の難易度クラス</p>
 * 
 */
public class Level {

	// 難易度
	private final int level;
	
	// 難易度をコンストラクタで設定
	public Level(int level) {
		this.level = level;
	}
	
	// 難易度を取得
	public int getLevel() {
		return level;
	}

	// 課題を解決する能力があるか判定
	public boolean lessThan(Level responsibleLevel) {
		return responsibleLevel.getLevel() >= level;
	}
	
}
