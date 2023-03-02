package code.collections;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Maps {

    public static void main(String[] args) {

        Map fruits = new HashMap();
        fruits.put("orange", 200);
        fruits.put("apple", 100);
        fruits.put("pear", 230);
        fruits.put("pinneaple", 900);
        fruits.put("orange", 89);
        fruits.put("apple", 78);

        System.out.println(fruits);

        System.out.println(fruits.containsValue(900));
    }
}
