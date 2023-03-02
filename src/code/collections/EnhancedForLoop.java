package code.collections;

import java.util.HashSet;
import java.util.Set;

public class EnhancedForLoop {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("apple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
