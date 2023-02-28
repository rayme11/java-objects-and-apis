package code.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    //Set is unordered / can't be duplicated on value / you can't control the order
    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.contains("apple"));

        fruits.remove("mango");
        System.out.println(fruits);
        System.out.println(fruits.size());


        //using set.of to add new items (it is immutable this way though)
        Set moreFruit = Set.of("apple","orange","pineapple", "pear");
        //moreFruit.remove("apple");  //will throw error as it is Set.of it is immutable
    }
}

