package com.slgerkamp.designpattern.templateMethod.techscore;

public class TanakasWoodCutPrint extends WoodCutPrint{

	@Override
	public void draw(Cuttable hanzai) {
		System.out.println(hanzai.getName() + "に描く");
	}

	@Override
	public void cut(Cuttable hanzai) {
		System.out.println(hanzai.getName() + "に切る");
	}

	@Override
	public void print(Cuttable hanzai) {
		System.out.println(hanzai.getName() + "にプリントする");
	}

	@Override
	public Cuttable createCuttable() {
		return new Wood();
	}
}
