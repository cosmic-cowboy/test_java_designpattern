package com.slgerkamp.designpattern.prototype.techscore;

public class Teacher{
	
	public Teacher() {
		this.keeper = new PrototypeKeeper();
	}
	private PrototypeKeeper keeper;

	public Paper[] createManyCrystals(){
		Paper prototype = new Paper("雪の結晶");
		drawCrystal(prototype);
		cutAccordanceWithLine(prototype);
		this.keeper.addCloneable("snow", prototype);
		Paper[] papers = new Paper[100];
		for(int n=0; n<papers.length ; n++){
			papers[n] = (Paper)keeper.getClone("snow");
		}
		return papers;
	}
	private void drawCrystal(Paper paper){
		// きれいに描くため時間がかかる
	}
	private void cutAccordanceWithLine(Paper paper){
		// 描かれた線に沿ってきれいに切るには時間がかかる
	}
}
