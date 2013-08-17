/**
 * Webアプリ開発エンジニアのための技術情報サイト[TECHSCORE]を写経
 * http://www.techscore.com/tech/DesignPattern/Flyweight.html/
 */
package com.slgerkamp.designpattern.flyweight.techscore;

/**
 * 人文字を作成して出力するクラス。
 */
public class Main {
    /**
     * 人文字を作成するメイン関数
     * @param args
     */
    public static void main(String args[]) {
    	HumanLetterFactory humanLetterFactory = HumanLetterFactory.getInstance();
    	
        HumanLetter あ =  humanLetterFactory.getHumanLetter("あ");
        takeAPhoto(あ);
        HumanLetter い = humanLetterFactory.getHumanLetter("い");
        takeAPhoto(い);
        HumanLetter は = humanLetterFactory.getHumanLetter("は");
        takeAPhoto(は);
        HumanLetter あ2 =  humanLetterFactory.getHumanLetter("あ");
        takeAPhoto(あ2);
        HumanLetter い2 = humanLetterFactory.getHumanLetter("い");
        takeAPhoto(い2);
        HumanLetter よ = humanLetterFactory.getHumanLetter("よ");
        takeAPhoto(よ);
        HumanLetter り = humanLetterFactory.getHumanLetter("り");
        takeAPhoto(り);
        HumanLetter も = humanLetterFactory.getHumanLetter("も");
        takeAPhoto(も);
        HumanLetter あ3 = humanLetterFactory.getHumanLetter("も");
        takeAPhoto(あ3);
        HumanLetter お = humanLetterFactory.getHumanLetter("お");
        takeAPhoto(お);
        HumanLetter い3 = humanLetterFactory.getHumanLetter("い");
        takeAPhoto(い3);
    }
 
    /**
     * 写真を撮るメソッド
     * @param letter
     */
    private static void takeAPhoto(HumanLetter letter) {
        System.out.print(letter.getLetter());
    }
 
}
