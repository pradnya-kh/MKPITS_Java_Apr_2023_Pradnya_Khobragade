package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStringList {
    public static void sorting() {
        List<String> name = Arrays.asList("Aniket","Abhishek","Avinash","Tejswini","Trupti","Pranay");
        System.out.println("------------------- create a list of strings and use a stream to sort them in ascending order ---------------------");
        List sortedString = name.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedString);
    }
}
