package HerbertSchildt;

public class CovertGallonToLiters {
    public static void main(String[] args) {
        double gallon = 1;
        double liters;
        int counter = 0;
        while(gallon <= 100){
            liters = gallon * 3.7854;
            System.out.printf ("%.1f%8s%.2f%6s%n", gallon, "  gallon is:    ", liters, "  liters" );
            counter++;
            if(counter == 10){
                System.out.println ();
                counter = 0;

            }
            gallon++;
        }
    }
}
