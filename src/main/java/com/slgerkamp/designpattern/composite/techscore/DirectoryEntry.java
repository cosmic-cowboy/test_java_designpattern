package com.slgerkamp.designpattern.composite.techscore;

/**
 * デザインパターン 11章　Composite パターン
 * http://www.techscore.com/tech/DesignPattern/Composite.html/
 * 
 * Compositeパターンの肝
 * ファイルとディレクトリを同一視するために、
 * ファイルとディレクトリ用の共通のインタフェースを提供
 * 
 */
public interface DirectoryEntry{

	// ファイルとディレクトリがどちらも必要な処理
	// ファイルとディレクトリを意識することなく利用できるように
	// removeメソッドを宣言する
	public void remove();
}