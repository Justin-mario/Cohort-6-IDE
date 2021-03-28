package fromchapter6;

public class SummingArrayValue {
    public static void main(String[] args) {
        int[] arrays = {6,9,8,4,2};
        int total = 0;
        int counter = 0;

        while(counter < arrays.length){
            total += arrays[counter++];
        }
        System.out.printf ( "Total is: %5d%n", total );
    }
}
