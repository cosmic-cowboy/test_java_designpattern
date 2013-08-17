/**
 * http://d.hatena.ne.jp/kuidaored/20110407/1302188459
 * を写経
 */
package com.slgerkamp.designpattern.composite.kuidaored;


/**
 * 基幹となるコンポーネントクラス
 */
abstract class ListComponent {

	// 表示
    public void print(){
        print("");
    }
    abstract void print(String prefix);
    
    // リストに要素を追加
    abstract void add(ListComponent items);
}
