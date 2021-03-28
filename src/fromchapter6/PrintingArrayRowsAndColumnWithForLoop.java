package fromchapter6;

public class PrintingArrayRowsAndColumnWithForLoop {
    public static void main(String[] args) {
        int[][] arrays = {{2,6,9,20,9,100}, {34,9,80,78,9},{30,34,89,90,9}};
        for (int firstArray[]: arrays
             ) {
            System.out.println ();
            for (int secondArray : firstArray
                 ) {
                System.out.print ( secondArray + " " );
            }

        }








    }
}
