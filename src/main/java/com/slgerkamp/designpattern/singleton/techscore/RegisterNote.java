package com.slgerkamp.designpattern.singleton.techscore;

public class RegisterNote {

	// クラスが初期化時に生成
	// 初期化はインスタンス生成時、staticメソッド呼び出し時
	private static RegisterNote registerNote = new RegisterNote();;

	private RegisterNote() {}
	
	public static RegisterNote getInstance(){
		return registerNote;
	}
	
}
