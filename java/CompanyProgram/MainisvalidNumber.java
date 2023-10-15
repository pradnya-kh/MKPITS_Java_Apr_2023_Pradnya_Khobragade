import java.util.Scanner;

class MainisvalidNumber {
    public static boolean isValidNumber(int num) {
        // Check if the unit's place contains the digit 2
        return num % 10 == 2;
    }

    public static int getValueAtIndex(int n) {
        // Initialize variables for the current number and the count of valid numbers
        int currentNumber = 1;
        int countValidNumbers = 0;

        // Iterate until we find the nth valid number
        while (true) {
            if (isValidNumber(currentNumber)) {
                countValidNumbers++;
                if (countValidNumbers == n) {
                    return currentNumber;
                }
            }
            currentNumber++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (1, 2, 3, etc.): ");
        int n = scanner.nextInt();

        int result = getValueAtIndex(n);

        if (result != 0) {
            System.out.println("The value at index " + n + " is " + result);
        } else {
            System.out.println("Invalid number");
        }
    }
}