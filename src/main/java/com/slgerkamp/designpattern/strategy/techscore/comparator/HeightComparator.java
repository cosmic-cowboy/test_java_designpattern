package com.slgerkamp.designpattern.strategy.techscore.comparator;

import com.slgerkamp.designpattern.strategy.techscore.Human;

/**
 * デザインパターン 10章　Strategy パターン
 * http://www.techscore.com/tech/DesignPattern/Strategy.html/
 * 
 * ConcreateStrategyクラス
 * 分離した比較アルゴリズムの実処理を受け持つ具象クラス
 * 
 */
public class HeightComparator implements Comparator {

	@Override
	public int compare(Human h1, Human h2) {
        if(h1.height > h2.height){
            return 1;
        }else if(h1.height == h2.height){
            return 0;
        }else{
            return -1;
        }
	}

}
