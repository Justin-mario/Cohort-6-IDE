package ChapterTwo;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        long worldPopulation = 7874765825L;
        long worldPopulation1 = (long) ((worldPopulation * 0.1) + worldPopulation);
        long worldPopulation2 = (long) ((worldPopulation1 * 0.98) + worldPopulation1);
        long worldPopulation3 = (long) ((worldPopulation2 * 0.96) + worldPopulation2);
        long worldPopulation4 = (long) ((worldPopulation3 * 0.94) + worldPopulation3);
        long worldPopulation5 = (long) ((worldPopulation4 * 0.91) + worldPopulation4);


        System.out.println ( "World_Population_Figures" + "\tYear    " + "\tEstimated Growth Rate" );
        System.out.println (worldPopulation + "\t\t\t\t\t2021");
        System.out.println (worldPopulation1 + "\t\t\t\t\t2022" + "\t\t\t\t\t0.1%");
        System.out.println(worldPopulation2 + "\t\t\t\t\t2023" + "\t\t\t\t\t0.98%");
        System.out.println (worldPopulation3 + "\t\t\t\t\t2022" + "\t\t\t\t\t0.1%");
        System.out.println(worldPopulation4 + "\t\t\t\t\t2023" + "\t\t\t\t\t0.98%");
        System.out.println (worldPopulation5 + "\t\t\t\t2022" + "\t\t\t\t\t0.1%");
    }
}
