package com.slgerkamp.designpattern.strategy.techscore;

import com.slgerkamp.designpattern.strategy.techscore.comparator.Comparator;

/**
 * デザインパターン 10章　Strategy パターン
 * http://www.techscore.com/tech/DesignPattern/Strategy.html/
 * 
 * Context クラス
 * Humanの比較を司るクラス
 * 
 * 比較のインタフェースは提供するが、実際の比較処理は、Comparator に委譲
 * 
 */
public class HumanComparator {

    // 比較アルゴリズムを委譲されたクラス
	// 一度設定されたアルゴリズムが変更されないように
	private final Comparator comparator;
	
	// 比較アルゴリズムは必ず必要なのでコンストラクタで設定
	public HumanComparator(Comparator comparator){
        this.comparator = comparator;
    }

    // 比較アルゴリズム部分を分離し、実際の比較処理は、Comparator に委譲
    public int compare(Human h1,Human h2){
        return comparator.compare(h1,h2);
    }
    
    // おまけ
    public String which(Human h1,Human h2){
    	int com = compare(h1, h2);
    	String rtn = h1.name;
    	switch (com) {
		case 0:
			rtn = "同じ";
			break;
		case -1:
			rtn = h2.name;
			break;

		default:
			break;
		}
    	return rtn;
    }
}
