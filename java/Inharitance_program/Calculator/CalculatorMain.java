package Calculator;

import java.util.Scanner;




public class CalculatorMain {
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
                s = new Subtraction();
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