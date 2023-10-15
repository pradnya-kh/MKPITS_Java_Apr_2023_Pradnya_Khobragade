import java.util.Scanner;

public class ShiftArrayElemts {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int []array=new int[5];
        for(int number=0;number<5;number++){
            System.out.print("Enter the array values : "+" ");
            int arrayValues= scanner.nextInt();
            array[number]=arrayValues;
        }
        System.out.println("---------------------");
        System.out.println("Display array values : ");
        for(int number=0;number<5;number++) {
            System.out.print(array[number]+" ");
        }
    }
}