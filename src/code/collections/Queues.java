package code.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    //FIFO approach
    public static void main(String[] args) {

        Queue fruits = new LinkedList();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("pinneaple");
        fruits.add("orange");
        fruits.add("apple");


        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println(fruits);
        System.out.println("What is the head of queue:" + fruits.peek());
    }
}
