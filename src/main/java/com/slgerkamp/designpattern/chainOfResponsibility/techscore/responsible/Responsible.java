package com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible;

import com.slgerkamp.designpattern.chainOfResponsibility.techscore.Question;

/**
 * <p>デザインパターン 14章　Chain of Responsibility パターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/ChainOfResponsibility.html/</p>
 * 
 * <p>chain は「鎖」、responsibility は「責任」</p>
 * <p>「責任」を負ったものが、「鎖」状につながれた状態</p>
 * 
 * <p>２つの役割がある</p>
 * <p>責任範囲、権限を管理、責任範囲、権限の異なるクラスを連続して呼び出す</p>
 * <p>責任範囲、権限を持つ</p>
 * 
 */
public abstract class Responsible {

	// より強い権限
	private Responsible next = null;

	// 責任職
	private String responsiblePerson = null;

	public Responsible(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	/**
	 * <p>より強い権限を設定し、設定したResponsibleを返す</p>
	 * 
	 * @param next
	 * @return
	 */
	public Responsible setNext(Responsible next){
		this.next = next;
		return next;
	}
	
	/**
	 * 
	 * <p>対象クラスにて判断を行う。</p>
	 * <p>解決できない場合、nextに設定した責任職に判断を委譲する。</p>
	 * 
	 * @param question
	 */
	public final void putQuestion(Question question){
		if (beAbleToJudge(question)) {
			judge(question);
		} else if (next != null){
			next.putQuestion(question);
		} else {
			System.out.println("誰にも判断できない");
		}
	}

	/**
	 * 
	 * <p>課題に対応できるか</p>
	 * 
	 * @param question
	 * @return
	 */
	protected abstract boolean beAbleToJudge(Question question);

	/**
	 * <p>対応手段</p>
	 * 
	 * @param question
	 * @return
	 */
	protected abstract void judge(Question question);

	// 対象した責務
	public String getResponsiblePerson() {
		return responsiblePerson;
	}

}
