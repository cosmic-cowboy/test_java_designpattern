package com.slgerkamp.designpattern.chainOfResponsibility.techscore;

/**
 * <p>デザインパターン 14章　Chain of Responsibility パターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/ChainOfResponsibility.html/</p>
 * 
 * <p>課題クラス</p>
 * 
 */
public class Question {

	// 課題の難易度
	private final Level level;

	// 課題の内容
	private final String content;

	// 課題の難易度をコンストラクタで設定
	private Question(String content, Level level) {
		this.content = content;
		this.level = level;
	}

	public static Question createQuestion(String content, Level level){
		Question question = new Question(content, level);
		System.out.println("質問内容：" + question.getContent());
		return question;
	}

	// 課題の難易度を取得
	public Level getLevel() {
		return level;
	}

	// 課題の内容を取得
	public String getContent() {
		return content;
	}

}
