package com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible;

import com.slgerkamp.designpattern.chainOfResponsibility.techscore.Level;
import com.slgerkamp.designpattern.chainOfResponsibility.techscore.Question;

public class ChiefTeacher extends Responsible {

	// 解決可能な責務の難易度
    private Level responsibleLevel = new Level(3);

	public ChiefTeacher(String responsiblePerson) {
		super(responsiblePerson);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	protected boolean beAbleToJudge(Question question) {
		if(question.getLevel().lessThan(responsibleLevel)){
            return true;
        }
        return false;
	}

	@Override
	protected void judge(Question question) {
		System.out.println("それ、わたくし（" + getResponsiblePerson() + "）が対応します");
	}


}
