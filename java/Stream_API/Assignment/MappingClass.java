package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,45,66,78,21,43);
        List list1= numbers.stream().map(c->c*2).collect(Collectors.toList());
        System.out.println(list1);
    }
}
