package ChapterTwo;

import java.util.Scanner;

public class CarPoolingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );

        System.out.print ("Input total miles per day: ");
        double totalMiles = input.nextDouble ();
        System.out.print ("Input cost of gasoline per day: ");
        double costOfGasoline = input.nextDouble ();
        System.out.print ("Input parking fees per day: ");
        double parkingFees = input.nextDouble ();
        System.out.print ("Input tolls per day: ");
        double tollsPerDay = input.nextDouble ();

        double averageMilesPerGallon = totalMiles/costOfGasoline;
        double dailyDrivingCost = totalMiles * costOfGasoline * parkingFees * tollsPerDay;

        System.out.println ("Daily Cost Of Driving Is: " + dailyDrivingCost);

    }
}
