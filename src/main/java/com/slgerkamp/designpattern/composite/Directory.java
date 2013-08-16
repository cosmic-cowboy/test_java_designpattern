/**
 * Webアプリ開発エンジニアのための技術情報サイト[TECHSCORE]を写経
 * http://www.techscore.com/tech/DesignPattern/Strategy.html/
 */
package com.slgerkamp.designpattern.composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
 
public class Directory{
	
	// Directory Files
	private final List<Object> list;
	// Directory Name
	private final String name;

	// constructor
    public Directory(String name){
        this.name = name;
        list = new ArrayList<Object>();
    }
    
    // add File to Directory
    public void add(File file){
        list.add(file);
    }
    // add Directory to Directory
    public void add(Directory dir){
        list.add(dir);
    }
    // delete Directory
    public void remove(){
        Iterator<Object> itr = list.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            if(obj instanceof File){
                ((File)obj).remove();
            }else if(obj instanceof Directory){
                ((Directory)obj).remove();
            }else{
                System.out.println("削除できません");
            }
        }
        System.out.println(name + "を削除しました。");
    }
}