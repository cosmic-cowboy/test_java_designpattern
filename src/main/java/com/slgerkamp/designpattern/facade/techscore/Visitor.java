package com.slgerkamp.designpattern.facade.techscore;

/**
 * <p>デザインパターン 15章　Facadeパターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/Facade.html/</p>
 * 
 * <p>書籍を借りに来た人クラス</p>
 * <p></p>
 *
 */
public class Visitor {
	
	public static void main(String[] args) {
  
		// 窓口の中村くんを作る
        Librarian librarian = new Librarian();
        //中村くんに昆虫図鑑の場所を聞く
        String location = librarian.searchBook("昆虫図鑑");
  
		if(location.equals("貸出中です")){
			System.out.println("貸出中かよ…");
		}else if(location.equals("その本は所蔵していません")){
			System.out.println("なんだ、ないのか");
		}else{
			System.out.println("サンキュ！");
		}
	}
}