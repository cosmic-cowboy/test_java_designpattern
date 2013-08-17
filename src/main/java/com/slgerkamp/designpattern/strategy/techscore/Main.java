package com.slgerkamp.designpattern.strategy.techscore;

import com.slgerkamp.designpattern.strategy.techscore.comparator.AgeComparator;
import com.slgerkamp.designpattern.strategy.techscore.comparator.HeightComparator;
import com.slgerkamp.designpattern.strategy.techscore.comparator.WeightComparator;

/**
 * 
 * 身長、体重、年齢を比較する
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Human h1 = new Human("h1", 180, 80, 23);
		Human h2 = new Human("h2", 179, 80, 50);
		
		HumanComparator height = new HumanComparator(new HeightComparator());
		
		System.out.println(height.which(h1, h2));
		
		HumanComparator weight = new HumanComparator(new WeightComparator());
		
		System.out.println(weight.which(h1, h2));

		HumanComparator age = new HumanComparator(new AgeComparator());
		
		System.out.println(age.which(h1, h2));

		
	}}
