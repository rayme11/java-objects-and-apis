package code.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ForEachMethod {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("apple");

        fruits.forEach(f -> System.out.println(f));

        fruits.forEach(System.out::println);

        //Lambda with HashMap

        Map<String, Integer> frutas = new HashMap();
        frutas.put("apple", 1);
        frutas.put("mango", 5);
        frutas.put("orange", 7);
        frutas.put("apple", 4);

        frutas.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
