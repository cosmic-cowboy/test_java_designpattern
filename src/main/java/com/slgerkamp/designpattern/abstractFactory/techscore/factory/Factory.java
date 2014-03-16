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
 * AbstractFactoryクラス
 * インスタンス生成に必要な処理を抽象化し、共通のインタフェースを提供
 * インスタンス生成自体は行わない
 * 
 */
public abstract class Factory {
	
	public abstract Soup getSoup();

	public abstract Protein getProtein();

	public abstract List<Vegetable> getVegetables();

	public abstract List<Ingredients> getOtherIngredients();
}
