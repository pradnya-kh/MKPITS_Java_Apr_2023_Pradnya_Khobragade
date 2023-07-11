

import java.util.Scanner;

public class MainSolidDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for solid star diamond pattern : ");
        int row = scanner.nextInt();

        DiamondStarPattern diamondStarPattern1 = new DiamondStarPattern();
        diamondStarPattern1.SolidDiamondPattern(row);
    }
}