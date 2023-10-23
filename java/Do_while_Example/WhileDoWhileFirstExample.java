import java.util.Scanner;

public class WhileDoWhileFirstExample {

//    public class CakeShop {

        public static void main(String[] args) {
            int availableCakes = 10;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Cake Shop!");

            while (availableCakes > 0) {
                System.out.println("We have " + availableCakes + " cakes available.");

                System.out.print("How many cakes would you like to buy? (Enter 0 to exit): ");
                int cakesToBuy = scanner.nextInt();

                if (cakesToBuy == 0) {
                    System.out.println("Thank you for visiting the Cake Shop. Goodbye!");
                    break;
                }

                if (cakesToBuy > availableCakes) {
                    System.out.println("Sorry, we don't have enough cakes. Please enter a smaller quantity.");
                    continue;
                }

                System.out.println("You bought " + cakesToBuy + " cake(s). Enjoy your purchase!");

                availableCakes = availableCakes - cakesToBuy;

            }

            if (availableCakes == 0) {
                System.out.println("We are sold out of cakes. Thank you for visiting the Cake Shop!");
            }
        }
    }

//