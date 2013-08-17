package com.slgerkamp.designpattern.strategy.techscore;

/**
 * デザインパターン 10章　Strategy パターン
 * http://www.techscore.com/tech/DesignPattern/Strategy.html/
 * 
 * 比較対象クラス
 * 
 */
public class Human {

    public String name;
    public int height = -1;
    public int weight = -1;
    public int age = -1;
 
    public Human(String name,int height,int weight,int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}
