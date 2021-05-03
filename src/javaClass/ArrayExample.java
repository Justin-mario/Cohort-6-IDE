package javaClass;

import java.util.*;
import java.util.Scanner;

public class ArrayExample {

    private static int[] arrays = new int[10];
    static int counter = 0;
    static int total;

    public static void arrayExample() {
        for (counter = 0; counter < arrays.length; counter++) {
            System.out.print ( arrays[counter] + " \n" );
        }
        System.out.print ( total + " " );

    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "Enter " + arrays.length + " Values: " );
        for (counter = 0; counter < arrays.length; counter++) {
        arrays[counter] = input.nextInt ();
        total += arrays[counter]; }
        arrayExample ();
    }
}