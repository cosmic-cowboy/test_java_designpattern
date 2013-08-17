/**
 * http://d.hatena.ne.jp/kuidaored/20110407/1302188459
 * を写経
 */
package com.slgerkamp.designpattern.composite.kuidaored;

import java.util.List;
import java.util.ArrayList;

abstract class AbstractListComponent extends ListComponent {
    private final List<ListComponent> items;
    private final String title;

    public AbstractListComponent(String title){
        items = new ArrayList<ListComponent>();
        this.title = title;
    }

    public void print(String prefix){
        System.out.println(title);
        for(ListComponent item : items){
            System.out.print(prefix);
            printPrefix();
            item.print(prefix + "  ");
        }
    }

    public void add(ListComponent item){
        items.add(item);
    }

    abstract void printPrefix();
}