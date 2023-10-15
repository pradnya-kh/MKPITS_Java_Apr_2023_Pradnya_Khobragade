import java.util.Scanner;

public class DoctorFeeStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of the patient = ");
        int age = scanner.nextInt();

        for(int number=1;number<=20;number++) {
            int fees=400;
            int fees1=300;
            int fees2=200;
            if (age != 0 && age < 120 && age < 0) {
                if (age < 17) {
                    System.out.println(fees2);
                } else if (age < 40 && age > 17) {
                    System.out.println(fees);
                } else {
                    System.out.println(fees1);
                }
            } else {
                System.out.println("Invalid input...");
            }
        }
    }
}