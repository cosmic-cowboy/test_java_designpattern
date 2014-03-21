package com.slgerkamp.designpattern.chainOfResponsibility.techscore;

import com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible.ChiefTeacher;
import com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible.ClassTeacher;
import com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible.Responsible;
import com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible.StaffMeeting;
import com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible.Student;


/**
 * <p>デザインパターン 14章　Chain of Responsibility パターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/ChainOfResponsibility.html/</p>
 * 
 * <p>実行</p>
 * 
 */
public class Main {
	public static void main(String[] args) {

		// 責任範囲、権限（1）を持つ
		Responsible nakagawa = new Student("中川雄介");

		// 責任範囲、権限（2）を持つ
		Responsible rookie = new ClassTeacher("新人先生");

		// 責任範囲、権限（3）を持つ
		Responsible veteran = new ChiefTeacher("ベテラン先生");

		// 責任範囲、権限（4）を持つ
		Responsible staffMeeting = new StaffMeeting("職員会議");
	    
		// 一番下っ端が権限の異なるクラスを連続して呼び出す役割を担う
	    nakagawa.setNext(rookie).setNext(veteran).setNext(staffMeeting);
	    
	    // 質問
	    nakagawa.putQuestion(Question.createQuestion("バナナはおやつに入るの？",new Level(1)));
	    nakagawa.putQuestion(Question.createQuestion("おやつはいくらまで？",new Level(2)));
	    nakagawa.putQuestion(Question.createQuestion("親に迎えに来てもらうのは？",new Level(3)));
	    nakagawa.putQuestion(Question.createQuestion("携帯電話持って行ってよい？",new Level(4)));
	    nakagawa.putQuestion(Question.createQuestion("どうしたら世界は平和になるの？",new Level(5)));
	}
}
