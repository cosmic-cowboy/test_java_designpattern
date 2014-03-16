package com.slgerkamp.designpattern.iterator.techscore;

/**
 * 集約体インタフェース
 * 集約体はかならずこのインタフェースを実装する
 */
public interface Aggregate {

	// Iterator インタフェースの実装クラスを返す
	public Iterator iterator();

}
