package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int milesDriven = 0;
        int gallonUsed;
        double milesPerGallon;
        double combinedMilesPerGallon = 0;


        while(milesDriven != -1){
            System.out.print ("Input Miles Driven: ");
            milesDriven = input.nextInt ();
            System.out.print ("Input Gallon Used: ");
            gallonUsed = input.nextInt ();

            milesPerGallon = milesDriven * 1.0/gallonUsed;
            milesPerGallon += milesPerGallon;
            milesPerGallon = milesPerGallon - 2;
            System.out.println ("Miles Per Gallon is: " + milesPerGallon );
            combinedMilesPerGallon += milesPerGallon;
        }

        System.out.println ("Combined Miles Per Gallon Is: " + combinedMilesPerGallon);
    }
}
