import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomPredicate {
    public static void numberGreaterThanTen(){
        List<Integer> list = Arrays.asList(12,4,54,30,6,9,8,23,15);
        Predicate<Integer> predicate = number -> number > 10;
        List numberList = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(numberList);
    }

}

