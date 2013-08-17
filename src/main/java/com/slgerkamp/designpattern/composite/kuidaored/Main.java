/**
 * http://d.hatena.ne.jp/kuidaored/20110407/1302188459
 * を写経
 */
package com.slgerkamp.designpattern.composite.kuidaored;

class Main {
    public static void main(String[] args){
        OrderedList ol = new OrderedList("Root Ordered List");
        ol.add(new Text("text1"));

        UnorderedList ul = new UnorderedList("Child Unordered List");
        ul.add(new Text("hogehoge"));
        ul.add(new Text("fugafuga"));

        OrderedList ol2 = new OrderedList("OrderedList 2");
        ol2.add(new Text("ListItem A"));
        ol2.add(new Text("ListItem B"));

        ul.add(ol2);

        ol.add(ul);
        ol.add(new Text("ol2"));

        ol.print();
    }
}