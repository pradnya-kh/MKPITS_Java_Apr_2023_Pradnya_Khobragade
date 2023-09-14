package funinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functionalinterface {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Wardha", "Nagpur", "pune", "mumbai");
        Consumer<List<String>> upperCaseConsumner = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        };
        Consumer<List<String>> printconsumenr = list -> list.stream().forEach(System.out::println);
        upperCaseConsumner.andThen(printconsumenr).accept(cities);
        //Supplier interface


        Supplier<Double> supplier = () -> {
            return Math.random();
        };
        System.out.println(supplier.get());

        //predicate interface


        Predicate<String> nameStartsWithN= str -> str.startsWith("n");
        Predicate<String> nameStartsWithA=str -> str.contains("G");
        cities.stream().filter(nameStartsWithA).forEach(System.out::println);//methodreference
        cities.stream().filter(nameStartsWithA).forEach(c -> System.out.println(c));//lambdaexpression


        //Function Interface

        Function<String,Integer> nameMappingFunction= String::length;
        cities.stream().map(nameMappingFunction).forEach(System.out::println);//methodreference
        cities.stream().map(nameMappingFunction).forEach(c -> System.out.println(c));//lambdaexpression

        //Exesting emplement interface

        Runnable runnable = System.out::println;
        runnable.run();
    }
    }

