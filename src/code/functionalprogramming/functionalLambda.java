package code.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class functionalLambda {

    public static void main(String[] args) {

        List countries = List.of("Mexico", "China", "El Salvador", "USA");

        Consumer print = c -> System.out.println(c);

        countries.forEach(print);
    }
}
