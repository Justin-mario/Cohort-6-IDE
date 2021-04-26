package javaClass;

public class MultiplicationTableWithWhileLoop {
    public static void main(String[] args) {
        System.out.print ( "           MULTIPLICATION TABLE\n" );
        int row = 1;
        while (row <= 6) {
            System.out.print ( "\t" + row );
            row++;
        }
        System.out.print ( "\n______________________\n" );
        int rows = 1;
        int columns = 1;
        while (columns <= 6) {
            System.out.print ( columns + " | " );
            columns++;
            while (rows <= 6) {
                System.out.print ( " " + columns * rows + " " );
                rows++;
            }
            System.out.println ();
        }
    }
}
