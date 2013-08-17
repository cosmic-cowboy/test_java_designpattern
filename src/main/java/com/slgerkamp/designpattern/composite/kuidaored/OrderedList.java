/**
 * http://d.hatena.ne.jp/kuidaored/20110407/1302188459
 * を写経
 */
package com.slgerkamp.designpattern.composite.kuidaored;

class OrderedList extends AbstractListComponent {
    private int number;

    public OrderedList(String title){
        super(title);
        number = 1;
    }

    public void printPrefix(){
        System.out.print(Integer.toString(number++) + " ");
    }
}