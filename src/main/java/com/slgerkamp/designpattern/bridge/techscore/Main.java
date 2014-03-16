package com.slgerkamp.designpattern.bridge.techscore;

import com.slgerkamp.designpattern.bridge.techscore.sortImple.BubbleSorter;


/**
 * デザインパターン 9章　Bridge パターン
 * http://www.techscore.com/tech/DesignPattern/Bridge.html/
 * 
 * 
 */
public class Main {
	public static void main(String[] args) {
		String [] array = {"あばま","いばま","うばま","えばま","おばま"};
		// ただのソート
		new Sorter(new BubbleSorter()).sort(array);
		
		// ソートの時間も図る
		new TimerSorter(new BubbleSorter()).timeSorter(array); 
	}
}
