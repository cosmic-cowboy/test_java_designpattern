package com.slgerkamp.designpattern.factoryMethod.techscore;

import com.slgerkamp.designpattern.templateMethod.techscore.Cuttable;
import com.slgerkamp.designpattern.templateMethod.techscore.TanakasWoodCutPrint;

public class ImagawasCutPrint extends TanakasWoodCutPrint {

	@Override
	public Cuttable createCuttable() {
		return new Potato();
	}

}
