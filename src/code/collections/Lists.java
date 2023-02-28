package code.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    // List are ordered, you can use index to access values , can have dupes
    public static void main(String[] args) {

        List fruits = new ArrayList();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("pinneaple");
        fruits.set(2, "nastyfruit");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.get(3));
        System.out.println(fruits.indexOf("apple"));
        System.out.println(fruits.lastIndexOf("apple"));

        //Create immutable list
        List moreFruit = List.of("orange", "apple", "pinneaple");


    }
}
