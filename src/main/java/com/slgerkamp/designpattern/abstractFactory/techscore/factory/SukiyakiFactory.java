package com.slgerkamp.designpattern.abstractFactory.techscore.factory;

import java.util.List;

import com.slgerkamp.designpattern.abstractFactory.techscore.ingredients.Ingredients;
import com.slgerkamp.designpattern.abstractFactory.techscore.protein.Protein;
import com.slgerkamp.designpattern.abstractFactory.techscore.soup.Soup;
import com.slgerkamp.designpattern.abstractFactory.techscore.vegetable.Vegetable;

/**
 * http://www.techscore.com/tech/DesignPattern/AbstractFactory.html/
 * 8. AbstractFactory パターン 参照
 * 
 * concreateFactory 具象クラス
 * AbstractFactoryを継承し、共通のインタフェースに対して具体的な処理を実装
 * 
 */
public class SukiyakiFactory extends Factory {

	@Override
	public Soup getSoup() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Protein getProtein() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Vegetable> getVegetables() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Ingredients> getOtherIngredients() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
