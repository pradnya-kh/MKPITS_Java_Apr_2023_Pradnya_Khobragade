
import java.util.Scanner;

public class SandGlassStarPattern extends SandGlassPattern{
	
    public void sandGlassStarPattern(int rows) {
        int array[][] = new int[rows][rows];
        for (int rowCounter = 1; rowCounter <= rows; rowCounter++) {
            for (int space = 1; space < rowCounter; space++) {
                System.out.print(" ");
            }

            for (int columnCounter = rowCounter; columnCounter <= rows; columnCounter++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rowCounter = rows - 1; rowCounter >= 1; rowCounter--) {
            for (int space = 1; space < rowCounter; space++) {
                System.out.print(" ");
            }

            for (int columnCounter = rowCounter; columnCounter <= rows; columnCounter++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
