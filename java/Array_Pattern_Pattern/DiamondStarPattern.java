

public class DiamondStarPattern extends SolidDiamondPattern {
    public void SolidDiamondPattern(int row){
//        int array[][] = new int[row][row];

        //Code for Upper half stars
		
        for(int rowCounter = 1; rowCounter <= row; rowCounter++){
            //spaces
            for(int space=1; space<=row-rowCounter; space++){
                System.out.print(" ");
            }
            //stars
            for(int columnCounter = 1; columnCounter <= 2*rowCounter-1; columnCounter++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Code for Lower half stars
        for(int rowCounter = row-1; rowCounter >= 1; rowCounter--){
            //spaces
            for(int space=1; space<=row-rowCounter; space++){
                System.out.print(" ");
            }
            //stars
            for(int columnCounter = 1; columnCounter <= 2*rowCounter-1; columnCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}