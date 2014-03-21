package com.slgerkamp.designpattern.chainOfResponsibility.techscore.responsible;

import com.slgerkamp.designpattern.chainOfResponsibility.techscore.Level;
import com.slgerkamp.designpattern.chainOfResponsibility.techscore.Question;

/**
 * <p>デザインパターン 14章　Chain of Responsibility パターン</p>
 * <p>http://www.techscore.com/tech/DesignPattern/ChainOfResponsibility.html/</p>
 * 
 * 
 */
public class ClassTeacher extends Responsible {

	// 解決可能な責務の難易度
    private Level responsibleLevel = new Level(2);

	public ClassTeacher(String responsiblePerson) {
		super(responsiblePerson);
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
