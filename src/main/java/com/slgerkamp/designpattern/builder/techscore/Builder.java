package com.slgerkamp.designpattern.builder.techscore;

/**
 * デザインパターン 7章　Builder パターン
 * http://www.techscore.com/tech/DesignPattern/Builder.html/
 * 
 * 「表現形式」を決定する Builder（インタフェース）
 *  オブジェクトの操作に必要な処理を抽象化し、共通のインタフェースを提供
 *  
 */
public interface Builder {
	public void addSolute(double soluteAmount);
	public void addSolvent(double solventAmount);
	public void abandonSolution(double solutionAmount);
	public Object getResult();
}
