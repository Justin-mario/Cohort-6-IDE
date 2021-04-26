package javaClass;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.print ( "\t\t\tMULTIPLICATION TABLE\n    " );
        for (int row = 1; row <= 12; row++) {
            System.out.print ( "\t" + row + "\t");
        }
        System.out.print ( "\n__________________________________________________________________________________________________" );
        System.out.println ();

        for (int column = 1 ; column <= 12; column++) {
            System.out.print ( column + " | " );
            for (int row = 1; row <= 12; row++) {
                System.out.print ("\t" + row * column  + "\t");
            }
            System.out.println ();
        }
    }
}