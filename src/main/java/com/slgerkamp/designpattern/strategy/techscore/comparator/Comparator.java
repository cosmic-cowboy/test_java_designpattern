package com.slgerkamp.designpattern.strategy.techscore.comparator;

import com.slgerkamp.designpattern.strategy.techscore.Human;

/**
 * デザインパターン 10章　Strategy パターン
 * http://www.techscore.com/tech/DesignPattern/Strategy.html/
 * 
 * Strategyクラス
 * 分離した比較アルゴリズムの実処理を受け持つインタフェース
 * 共通のインタフェースを定義
 * アルゴリズムの修正、追加を容易にする
 * 
 */
public interface Comparator{
    public int compare(Human h1,Human h2);
}