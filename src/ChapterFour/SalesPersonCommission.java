package ChapterFour;

import java.util.Scanner;

public class SalesPersonCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        double priceOfItemSold = 0;
        double totalPriceOfItemSold = 0;
        double salesCommission;
        double salesManWeeklyEarning = 0;
        while(priceOfItemSold != -1) {
            System.out.print ( "Enter price of item sold: " );
            priceOfItemSold = input.nextDouble ();
            totalPriceOfItemSold += priceOfItemSold;
            salesCommission = (totalPriceOfItemSold + 1) * 0.09;
            salesManWeeklyEarning = salesCommission + totalPriceOfItemSold + 201;

        }
        System.out.println (salesManWeeklyEarning);
    }
}
