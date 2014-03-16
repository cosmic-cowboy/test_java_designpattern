package com.slgerkamp.designpattern.templateMethod.techscore;

public abstract class WoodCutPrint {

	public abstract void draw(Cuttable hanzai);

	public abstract void cut(Cuttable hanzai);

	public abstract void print(Cuttable hanzai);
	
	public abstract Cuttable createCuttable();
	
	// テンプレートメソッド
	// finalをつけて処理が変えられないほうが良いのでは？
	public final void createWoodCutPrint(){

		Cuttable hanzai = createCuttable();
		
		cut(hanzai);
		
		draw(hanzai);		
		
		print(hanzai);
		
	};
	
}
