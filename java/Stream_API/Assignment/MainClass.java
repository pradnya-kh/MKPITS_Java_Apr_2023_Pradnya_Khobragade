package Assignment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Filtering and Collecting \n 2 - Mapping \n 3 - Sorting \n 4 - Combining operations \n 5 - Grouping and counting \n 6 - Finding Max and Min \n " +
                "7 - Using predicates (number greater than 10) \n 8 - flatMap(merged list and find sum) \n 9 - Infinite stream (random number)");
        System.out.println("Enter your choice ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                FilteringAndCollectingMain.filteringCollecting();
                break;
            case 2:
                MappingDoubleInteger.doubleInteger();
                break;
            case 3:
                SortedStringList.sorting();
                break;
            case 4:
                CombiningOperationsMain.combineOperation();
                break;
            case 5:
                GroupingAndCountingMain.groupingCounting();
                break;
            case 6:
                OldestAndYoungestByStream.oldestYoungest();
                break;
            case 7:
                CustomPredicate.numberGreaterThanTen();
                break;
            case 8:
                FlatMapMergingMain.mergingOperation();
                break;
            case 9:
                InfiniteStreamRandomNumber.randomNumberTen ();
                break;
        }
    }
}

