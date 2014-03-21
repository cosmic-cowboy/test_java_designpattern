package com.slgerkamp.designpattern.facade.techscore;

/**
 * <p>デザインパターン 15章　Facadeパターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/Facade.html/</p>
 * 
 * <p>図書館員クラス</p>
 * <p>書籍を借りに来た人が書籍を借りるためのサポートをする</p>
 *
 */
public class Librarian {

	public String searchBook(String bookName) {

		//探す
		BookList bookList = new BookList();
		String location = bookList.searchBook(bookName);

		//所蔵しいてるとき
		if (location != null) {
			//貸出中か
			LendingList lendingList = new LendingList();
		
			if (lendingList.check(bookName)) {
			//貸出中のとき
				return "貸出中です";
			} else {
			//貸出中ではないとき
				return location;
			}
		//所蔵してないとき
		} else {
			return "その本は所蔵していません";
		}
	}
}