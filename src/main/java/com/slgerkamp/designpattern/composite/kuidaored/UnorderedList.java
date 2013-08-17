/**
 * http://d.hatena.ne.jp/kuidaored/20110407/1302188459
 * を写経
 */
package com.slgerkamp.designpattern.composite.kuidaored;

class UnorderedList extends AbstractListComponent {

    public UnorderedList(String title){
        super(title);
    }

    public void printPrefix(){
        System.out.print("- ");
    }

}
