package HerbertSchildt;

public class Recursion {
    public static void main(String[] args) {
        ComputingFactorialWithRecursionAndLoop f = new ComputingFactorialWithRecursionAndLoop ();
        System.out.println ( "factorials using recursive method." );
        System.out.println ( "factorial of 3 is " + f.factorial ( 3 ) );
        System.out.println ( "factorial of 4 is " + f.factorial ( 4 ) );
        System.out.println ( "factorial of 5 is " + f.factorial ( 5 ) );
        System.out.println ();

        System.out.println ( "factorials using iterative method." );
        System.out.println ( "factorial of 3 is " + f.factorial1 ( 3 ) );
        System.out.println ( "factorial of 4 is " + f.factorial1 ( 4 ) );
        System.out.println ( "factorial of 5 is " + f.factorial1 ( 5 ) );
    }
}