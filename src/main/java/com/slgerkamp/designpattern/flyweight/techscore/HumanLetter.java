/**
 * Webアプリ開発エンジニアのための技術情報サイト[TECHSCORE]を写経
 * http://www.techscore.com/tech/DesignPattern/Flyweight.html/
 */
package com.slgerkamp.designpattern.flyweight.techscore;

public class HumanLetter {
	private final String letter;

	public HumanLetter(String letter) {
		this.letter = letter;
	}

	public String getLetter() {
		return letter;
	}
}
