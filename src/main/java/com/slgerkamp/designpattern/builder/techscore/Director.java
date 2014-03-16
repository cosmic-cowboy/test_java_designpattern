package com.slgerkamp.designpattern.builder.techscore;

/**
 * デザインパターン 7章　Builder パターン
 * http://www.techscore.com/tech/DesignPattern/Builder.html/
 * 
 * 「作成過程」を決定する Director
 *  オブジェクト生成、属性の設定など
 *
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constract(){
		builder.addSolvent(100);
		builder.addSolute(40);
		builder.abandonSolution(70);
		builder.addSolvent(100);
		builder.addSolute(15);
	}
}
