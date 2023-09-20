package StreamExample1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("wardha","Nagpur","pune","Mumbai");
        List list=cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> numbers=Arrays.asList(34,34,24,23,45,23,23,12);
        List list1=numbers.stream().filter(n ->n%2==0).collect(Collectors.toList());
        System.out.println(list1);

        //finding sorted data
        cities.stream().sorted().forEach(System.out::println);

        //skiping
        cities.stream().skip(2).forEach(System.out::println);

        int Sumofnumbers=numbers.stream().reduce(0,(sum,n)->sum+n);
        System.out.println(Sumofnumbers);
        //sum of even numbers
        int SumofEvenNumbers= numbers.stream().filter(n ->n%2==0).reduce(0,(sum,n)->sum+n);
        System.out.println(SumofEvenNumbers);
    }
}
