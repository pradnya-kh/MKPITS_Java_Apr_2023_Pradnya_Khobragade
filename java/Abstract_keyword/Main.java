

//public class Main {
  //  public static void main(String[] args) {
       // Circle circle=new Circle(5);
       // Rectangle rectangle=new Rectangle(5,2);
             //    circle.area();
       //          rectangle.area();

   // }
//}
import calculator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for Choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                s = new Addition();
                System.out.println("enter 2 number :");
                System.out.println(s.calculate(sc.nextInt(), sc.nextInt()));
                break;
            case 2:
                s = new Subtration();
                System.out.println("enter 2 number :");
                System.out.println(s.calculate(sc.nextInt(), sc.nextInt()));
                break;
            case 3:
                s = new Multiplication();
                System.out.println("enter 2 number :");
                System.out.println(s.calculate(sc.nextInt(), sc.nextInt()));
                break;
            case 4:
                s = new Division();
                System.out.println("enter 2 number :");
                System.out.println(s.calculate(sc.nextInt(), sc.nextInt()));
                break;

        }
    }
}
