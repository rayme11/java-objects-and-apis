package code.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        int[] numbers = { 0, 2, 4, 6, 8, 10};

        Arrays.stream(numbers).parallel()
                .forEach(n -> System.out.println(n + 1 + " "));


        //Some streams operations
        List<String> veggies = List.of(
                "spinach",
                "cabage",
                "peas",
                "green beans",
                "carrots",
                "spinach"
        );

        System.out.println(veggies.stream().anyMatch(v -> v.contains("spinach")));

        veggies.stream().filter(v -> v.startsWith("c"))
                .forEach(System.out::println);
    }
}
