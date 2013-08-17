/**
 * Webアプリ開発エンジニアのための技術情報サイト[TECHSCORE]を写経
 * http://www.techscore.com/tech/DesignPattern/Flyweight.html/
 */
package com.slgerkamp.designpattern.flyweight.techscore;

import java.util.HashMap;
import java.util.Map;
 
/**
 * 人文字を管理するクラス。
 * Singleton とする。
 */
public class HumanLetterFactory {
    /**
     * 人文字のマップ
     */
    Map<String,HumanLetter> map = new HashMap<String,HumanLetter>();
 
    /**
     * Singleton の生成
     */
    private static HumanLetterFactory singleton = new HumanLetterFactory();
 
    /**
     * Singleton パターン
     */
    private HumanLetterFactory() {}
 
    /**
     * インスタンスを取得するメソッド
     * 唯一のインスタンスが返される。
     * @return singleton
     */
    public static HumanLetterFactory getInstance() {
        return singleton;
    }
 
    /**
     * 人文字を取得するメソッド。
     * すでに持っているものであれば、map から返す。
     * map に持っていないものは生成して map への登録を行った後に返り値として返す。
     *
     * @param letter
     * @return humanLetter
     */
    public synchronized HumanLetter getHumanLetter(String letter) {
        HumanLetter humanLetter = map.get(letter);
        if (humanLetter == null) {
            humanLetter = new HumanLetter(letter);
            map.put(letter, humanLetter);
        }
        return humanLetter;
    }
 
}