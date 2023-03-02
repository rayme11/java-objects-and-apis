package code.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("apple");

        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
