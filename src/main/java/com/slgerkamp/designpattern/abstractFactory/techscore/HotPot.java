package com.slgerkamp.designpattern.abstractFactory.techscore;

import java.util.List;

import com.slgerkamp.designpattern.abstractFactory.techscore.ingredients.Ingredients;
import com.slgerkamp.designpattern.abstractFactory.techscore.protein.Protein;
import com.slgerkamp.designpattern.abstractFactory.techscore.soup.Soup;
import com.slgerkamp.designpattern.abstractFactory.techscore.vegetable.Vegetable;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * 集約オブジェクト
 * 鍋に必要な一式を保持している
 *
 */
public class HotPot {

	private Pot pot;
	private Soup soup;
	private Protein protein;
	private List<Vegetable> vegetables;
	private List<Ingredients> otherIngredients;

	public HotPot(Pot pot) {
		this.pot = pot;
	}

	public void addSoup(Soup soup) {
		this.soup = soup;
	}

	public void addMain(Protein protein) {
		this.protein = protein;
	}

	public void addVegetables(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}

	public void addOtherIngredients(List<Ingredients> otherIngredients) {
		this.otherIngredients = otherIngredients;
	}

	public void eat() {
		System.out.println(pot.getName() + "でつくる");
		System.out.println(soup.getName());
		System.out.println(protein.getName());
		for(Vegetable v : vegetables) System.out.print(v.getName() + " ");
		System.out.println();
		for(Ingredients i : otherIngredients) System.out.print(i.getName() + " ");
		System.out.println();
	}


}
