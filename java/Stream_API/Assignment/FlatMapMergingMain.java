package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMergingMain {

   // public static void main(String[] args) {
        public static void mergingOperation() {
            System.out.println("----------------------- create a list of list and merge it in one -----------------------");
            List<Integer> flatMapList = Stream.of(Arrays.asList(34,66,65),Arrays.asList(55,23,65,76)).flatMap(List::stream).collect(Collectors.toList());
            System.out.println(flatMapList);
            int listSum = flatMapList.stream().reduce(0,(sum,i)->sum+i);
            System.out.println(listSum);

            List <List<Integer>> listOfList = new ArrayList<>();
            listOfList.add(Arrays.asList(23,34,31,5));
            listOfList.add(Arrays.asList(65,32,65));
            listOfList.add(Arrays.asList(87,34,12));
            System.out.println(listOfList);
            List<Integer> mergedList = listOfList.stream().flatMap(l->l.stream()).collect(Collectors.toList());
            System.out.println(mergedList);
            int sumList = mergedList.stream().reduce(0,Integer::sum);
            System.out.println(sumList);

        }

}
