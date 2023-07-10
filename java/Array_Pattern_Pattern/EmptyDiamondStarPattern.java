import java.util.Scanner;

public class EmptyDiamondStarPattern {
    public int emptyDiamondStarPattern(int row, int column){
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[row][column];
        System.out.println("Enter row size : ");
        row= scanner.nextInt();
        System.out.println("Enter column size : ");
        column= scanner.nextInt();
        int middleValue = row/2;

        for(int rowCounter = 0; rowCounter<row; rowCounter++){
            for(int columnCounter = 0; columnCounter < column; columnCounter++){
                if(rowCounter <= middleValue){
                    if(columnCounter == middleValue - rowCounter ||  columnCounter == middleValue + rowCounter){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(columnCounter == middleValue - (row - 1 - rowCounter) || columnCounter == middleValue + (row - 1 - rowCounter)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        return 0;
    }
}