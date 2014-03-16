package com.slgerkamp.designpattern.abstractFactory.techscore.factory;

import java.util.ArrayList;
import java.util.List;

import com.slgerkamp.designpattern.abstractFactory.techscore.ingredients.Ingredients;
import com.slgerkamp.designpattern.abstractFactory.techscore.ingredients.Tofu;
import com.slgerkamp.designpattern.abstractFactory.techscore.protein.Chicken;
import com.slgerkamp.designpattern.abstractFactory.techscore.protein.Protein;
import com.slgerkamp.designpattern.abstractFactory.techscore.soup.ChickenBoneSoup;
import com.slgerkamp.designpattern.abstractFactory.techscore.soup.Soup;
import com.slgerkamp.designpattern.abstractFactory.techscore.vegetable.ChineseCabbage;
import com.slgerkamp.designpattern.abstractFactory.techscore.vegetable.Chrysanthemum;
import com.slgerkamp.designpattern.abstractFactory.techscore.vegetable.Leak;
import com.slgerkamp.designpattern.abstractFactory.techscore.vegetable.Vegetable;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * concreateFactory 具象クラス
 * AbstractFactoryを継承し、共通のインタフェースに対して具体的な処理を実装
 * 
 */
public class MizutakiFactory extends Factory {

	@Override
	public Soup getSoup() {
		return new ChickenBoneSoup();
	}

	@Override
	public Protein getProtein() {
		return new Chicken();
	}

	@Override
	public List<Vegetable> getVegetables() {
		List<Vegetable> vegetables = new ArrayList<Vegetable>();
		vegetables.add(new ChineseCabbage());
		vegetables.add(new Leak());
		vegetables.add(new Chrysanthemum());
		return vegetables;
	}

	@Override
	public List<Ingredients> getOtherIngredients() {
		List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
		otherIngredients.add(new Tofu());
		return otherIngredients;
	}

}
