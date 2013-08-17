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
        HumanLetter あ = new HumanLetter("あ");
        takeAPhoto(あ);
        HumanLetter い = new HumanLetter("い");
        takeAPhoto(い);
        HumanLetter は = new HumanLetter("は");
        takeAPhoto(は);
        takeAPhoto(あ);
        takeAPhoto(い);
        HumanLetter よ = new HumanLetter("よ");
        takeAPhoto(よ);
        HumanLetter り = new HumanLetter("り");
        takeAPhoto(り);
        HumanLetter も = new HumanLetter("も");
        takeAPhoto(も);
        takeAPhoto(あ);
        HumanLetter お = new HumanLetter("お");
        takeAPhoto(お);
        takeAPhoto(い);
    }
 
    /**
     * 写真を撮るメソッド
     * @param letter
     */
    private static void takeAPhoto(HumanLetter letter) {
        System.out.print(letter.getLetter());
    }
 
}
