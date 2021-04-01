package javaClass;

public class Array {
    public static void main(String[] args) {
        int [] numbers= new int[6];
        int counter;
        for (counter = 1; counter <= 5; counter = counter + 1)
            numbers[counter] = counter;

        /*numbers[0] = 10;
        numbers [1] = 22;
        numbers[2] = 38;
        numbers[3] = 47;
        numbers[4] = 50;*/

        for(counter = 1; counter <= 5; counter = counter + 1)//while( counter < 5  ){
        System.out.println ( numbers[counter]);

       // counter++;}
    }
}
