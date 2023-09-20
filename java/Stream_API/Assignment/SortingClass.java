package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingClass {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Pradnya","Riya","shreya","Sita");
        List list1=name.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);
    }
}
