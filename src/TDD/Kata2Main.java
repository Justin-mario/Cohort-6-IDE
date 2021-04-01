package TDD;




public class Kata2Main {
    public static void main(String[] args) {

        int[] arrays = {20,15,5,10,6,9};
        System.out.println (  Kata2.getSum ( arrays ));


        System.out.println ( Kata2.getAverage ( arrays ) );

        System.out.println ( Kata2.getMaximum ( arrays ) );
        System.out.println ( Kata2.getMinimum ( arrays ));
        System.out.println ( Kata2.getSum (arrays) - Kata2.getMaximum ( arrays ) );
        System.out.print ( Kata2.getSum ( arrays ) - Kata2.getMinimum ( arrays ) );

    }
}

