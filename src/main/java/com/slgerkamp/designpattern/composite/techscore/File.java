package com.slgerkamp.designpattern.composite.techscore;

/**
 * デザインパターン 11章　Composite パターン
 * http://www.techscore.com/tech/DesignPattern/Composite.html/
 * 
 * ファイルクラス
 * 
 * 他の要素を共通で扱えるようにDirectoryEntryを継承
 * これにより共通の要素としてCollectionへの追加が
 * removeメソッドにより削除が可能になる
 * 
 */
public class File implements DirectoryEntry{
	
	// fileName
	private final String name;
	
	// constructor
	public File(String name){
		this.name = name;
	}
	
	/* (非 Javadoc)
	 * @see com.slgerkamp.designpattern.composite.techscore.DirectoryEntry#remove()
	 */
	@Override
	public void remove(){
		System.out.println(name + "を削除しました");
	}
}
