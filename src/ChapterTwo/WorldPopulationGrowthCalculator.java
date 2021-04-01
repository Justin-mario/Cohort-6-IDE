package ChapterTwo;

import java.math.BigDecimal;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        long worldPopulation = 7-874-765-825;
        long worldPopulation1 = (worldPopulation * (long) 0.1) + worldPopulation;
        long worldPopulation2 = (worldPopulation1 * (long) 0.98 + worldPopulation1);
        long worldPopulation3 = (worldPopulation2 * (long) 0.96 + worldPopulation2);
        long worldPopulation4 = (worldPopulation3 * (long) 0.94 + worldPopulation3);
        long worldPopulation5 = (worldPopulation4 * (long) 0.91 + worldPopulation4);


        System.out.println ( "World Population Figures   " + "Year    " + " Estimated Growth Rate" );
        System.out.println ( "7,874,765,825"  + " 2021\n" + worldPopulation1 + "2022 " + "0.1%\n" + worldPopulation2
         + "2023" + "0.98%");
        //System.out.println (  "2022" );
    }
}
