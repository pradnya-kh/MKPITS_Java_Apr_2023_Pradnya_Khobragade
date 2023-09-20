package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingDoubleInteger {
    public static void doubleInteger() {
        System.out.println("---------------- create a list of integers and use a stream to double each integer in the list ------------------");
        List<Integer> numberList = Arrays.asList(12,13,21,7,8,9,11,6);
        List list2 = numberList.stream().map(number->number*2).collect(Collectors.toList());
        System.out.println(list2);
    }
}

