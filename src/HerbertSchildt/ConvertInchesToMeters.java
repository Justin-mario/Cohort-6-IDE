package HerbertSchildt;

public class ConvertInchesToMeters {
    public static void main(String[] args) {
        double inches = 1;
        double meters;
        int counter = 0;

        while(inches <= 120){
            meters = inches * 39.37;
            counter++;
            System.out.printf ( "%.2f%6s%.2f%s%n", inches, "\tinches equals  ", meters, "\tmeters  " );

            if(counter == 12){
                System.out.println ();
                counter = 0;
            }
            inches++;
        }
    }
}
