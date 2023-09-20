package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndCollectingMain {
    //public static void main(String[] args) {
    public static void filteringCollecting() {
        List<String> name = Arrays.asList("Aniket", "Abhi", "Avinash", "Tejswini", "Trupti", "Pranay");
        System.out.println("----------- Create a list of strings and use a stream to filter out strings that start with the letter A ------------");
        List list = name.stream().filter(filterObject -> filterObject.contains("A")).collect(Collectors.toList());
        System.out.println(list);
        name.stream().filter(filterObject1 -> filterObject1.contains("A")).forEach(System.out::println);
    }
}
