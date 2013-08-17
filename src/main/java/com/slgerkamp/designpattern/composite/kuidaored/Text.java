/**
 * http://d.hatena.ne.jp/kuidaored/20110407/1302188459
 * を写経
 */
package com.slgerkamp.designpattern.composite.kuidaored;

class Text extends ListComponent {
    private final String text;

    public Text(String text){
        this.text = text;
    }

    public void print(String prefix){
        System.out.println(text);
    }

    public void add(ListComponent item){
        return;
    }
}