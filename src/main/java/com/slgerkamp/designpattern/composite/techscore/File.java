/**
 * Webアプリ開発エンジニアのための技術情報サイト[TECHSCORE]を写経
 * http://www.techscore.com/tech/DesignPattern/Strategy.html/
 */
package com.slgerkamp.designpattern.composite.techscore;

public class File implements DirectoryEntry{
	// fileName
	private final String name;
	
	// constructor
    public File(String name){
        this.name = name;
    }
    
    // delete file
    public void remove(){
        System.out.println(name + "を削除しました");
    }
}
