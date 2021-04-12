package ChapterFour;

public class WorldPopulation {
    public static void main(String[] args) {
        double populationIncrease = 0;
        double newPopulation ;
        double worldPopulation = 7874765825.0;
        int years = 0;
        System.out.println ("year\t" + "New Population\t" + "\tIncrease In Population");
        newPopulation = worldPopulation * 0.1 + worldPopulation;
        populationIncrease += newPopulation - worldPopulation;

        while (years < 75) {
            newPopulation += worldPopulation * 0.1 + worldPopulation;
            populationIncrease += newPopulation - worldPopulation;
            years++;
            System.out.println (years +"\t \t"+ newPopulation + " \t\t"+ populationIncrease);
        }

    }
}