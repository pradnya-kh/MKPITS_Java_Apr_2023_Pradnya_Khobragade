package LambdaExpressionExample2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter your choice /n 1. Addition of two number \n 2.Subtraction of Two number \n3. Multiplication of two number \n4.Division of two number");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Calculator calculator = (number1, number2) -> {
                    System.out.println(number1 + number2);
                };
                calculator.calArea(a, b);
                break;
            case 2:
                Calculator calculator1 =(number1, number2) -> {
                    System.out.println(number1 - number2);
                };
                calculator1.calArea(a,b);
                break;
            case 3:
                Calculator calculator2 =(number1, number2) -> {
                    System.out.println(number1 * number2);
                };
                calculator2.calArea(a,b);
                break;
            case 4:
                Calculator calculator3 =(number1, number2) -> {
                    System.out.println(number1 / number2);

                };
                calculator3.calArea(a,b);
                break;


        }
    }
}