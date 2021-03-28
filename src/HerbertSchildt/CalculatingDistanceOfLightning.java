package HerbertSchildt;

public class CalculatingDistanceOfLightning {
    public static void main(String[] args) {
        double sound = 1100;
        double time = 7.2;

        double distance = sound * time;
        double echo = time/2;
        System.out.printf ( "%s%.2f%s%n","The Lightning is ", distance, "  feet away." );
        System.out.printf ( "%s%f%n", "Time it takes echo to go one way is ", echo );
    }
}
