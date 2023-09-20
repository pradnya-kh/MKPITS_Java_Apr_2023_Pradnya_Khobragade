package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombiningOperationsMain {

        public static void combineOperation() {
            List<Integer> numberList = Arrays.asList(12, 13, 21, 7, 8, 9, 11, 6);
            System.out.println("-------- create a list of integers and use a stream to filter out teh even numbers, double each remaining number, and then find the sum of teh double numbers ----------------------");
            System.out.println("-------------------- Even number list --------------------");
            List evenNumber = numberList.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
            System.out.println(evenNumber);
            System.out.println("-------------------- Double of Remaining odd Number --------------------------");
            List doubleOfOddNumber = numberList.stream().filter(number -> number % 2 != 0).map(number -> number * 2).collect(Collectors.toList());
            System.out.println(doubleOfOddNumber);
            System.out.println("---------------------- sum of remaining double odd number -----------------------------");
            int remainingOddNumberSum = numberList.stream().filter(number -> number % 2 != 0).map(number -> number * 2).reduce(0, (sum, i) -> sum + i);
            System.out.println(remainingOddNumberSum);
        }
    }
