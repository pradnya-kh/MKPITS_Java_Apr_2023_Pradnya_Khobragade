package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCountingMain {
   // public static void main(String[] args) {
        public static void groupingCounting () {
            List<String> name = Arrays.asList("Aniket", "Abhishek", "Avinash", "Tejswini", "Trupti", "Pranay");
            System.out.println("---------------------- Grouping and Counting in stream ---------------------------");

            Map<Integer, List<String>> map1 = name.stream().collect(Collectors.groupingBy(String::length));
            System.out.println(map1);

            System.out.println(name.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));

            Map<Integer, Long> map = name.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
            System.out.println(map);
            map.forEach((key, value) -> System.out.println("Strings of length " + key + " are " + value));


        }
    }

