package HerbertSchildt;

public class FindingSquareRoot {
    public static void main(String[] args) {
        int counter = 1;
        double squareRoot;
        double error;
        for(; counter < 100; counter++){
            squareRoot = Math.sqrt ( counter );
            error = counter - (squareRoot * squareRoot);
            System.out.printf ("%18s%d%5s%.2f%n", "Square root of " , counter,"is\t", squareRoot);
            System.out.printf ( "%s%f%n","Rounding of error is\t",error );

        }
    }
}
