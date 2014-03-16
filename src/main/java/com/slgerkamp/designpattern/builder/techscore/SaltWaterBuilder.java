package com.slgerkamp.designpattern.builder.techscore;


/**
 * デザインパターン 7章　Builder パターン
 * http://www.techscore.com/tech/DesignPattern/Builder.html/
 * 
 * 「表現形式」を決定する Builder（具象クラス）
 *  
 */
public class SaltWaterBuilder implements Builder {

	private SaltWater saltWater;
	
	public SaltWaterBuilder() {
		this.saltWater = new SaltWater(0,0);
	}

	public void addSolute(double soluteAmount) {
		saltWater.salt += soluteAmount;
	}

	public void addSolvent(double solventAmount) {
		saltWater.water += solventAmount;
	}

	public void abandonSolution(double solutionAmount) {
		double saltDelta = solutionAmount * (saltWater.salt  / saltWater.getAmount());
		double waterDelta = solutionAmount * (saltWater.water / saltWater.getAmount());
		saltWater.salt  -= saltDelta;
		saltWater.water -= waterDelta;
	}

	public Object getResult() {
		return this.saltWater;
	}

}
