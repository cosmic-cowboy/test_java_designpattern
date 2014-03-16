package com.slgerkamp.designpattern.composite.techscore;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * デザインパターン 11章　Composite パターン
 * http://www.techscore.com/tech/DesignPattern/Composite.html/
 * 
 * ディレクトリクラス
 * 
 * 他の要素を共通で扱えるようにDirectoryEntryを継承
 * これにより共通の要素としてCollectionへの追加が
 * removeメソッドにより削除が可能になる
 * 
 * 
 */
public class Directory implements DirectoryEntry{
	
	// ディレクトリの中身をDirectoryEntryに統一
	// Directory Files
	private final List<DirectoryEntry> list;
	// Directory Name
	private final String name;
	
	// constructor
	public Directory(String name){
		this.name = name;
		list = new ArrayList<DirectoryEntry>();
	}
 
	/**
	 * 
	 * DirectoryEntryにより
	 * ディレクトリとファイルの追加を
	 * 共通のメソッドで対応可能に
	 * add File to Directory
	 * add Directory to Directory
	 * 
	 * @param entry
	 * 
	 */
	public void add(DirectoryEntry entry){
		list.add(entry);
	}

	/* (非 Javadoc)
	 * @see com.slgerkamp.designpattern.composite.techscore.DirectoryEntry#remove()
	 * 
	 * DirectoryEntryにより
	 * ディレクトリとファイル、シンボリックリンクの削除を
	 * 共通の処理で対応可能に
	 * 
	 */
	@Override
	public void remove(){
		Iterator<DirectoryEntry> itr = list.iterator();
		while(itr.hasNext()){
			DirectoryEntry entry = itr.next();
			entry.remove();
		}
		System.out.println(name + "を削除しました。");
	}
}