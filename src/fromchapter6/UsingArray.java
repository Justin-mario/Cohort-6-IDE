package fromchapter6;



public class UsingArray {
    public static void main(String[] args) {
        int counter = 0;
        int [] array = {34,67,9,8,6,45,90};
        System.out.printf( "%s%10s%n", "Index", "Value" );

        while(counter < array.length){
            System.out.printf ( "%3d%10d%n", counter, array[counter++] );

        }
    }
}
