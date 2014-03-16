package com.slgerkamp.designpattern.adapter.techscore;

public class NewTaro extends Taro implements Chairperson {

	// インタフェースを切り替えただけ
	@Override
	public void organizeClass() {
		enjoyWithAllClassmate();		
	}

}
