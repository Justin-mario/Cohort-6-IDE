package HerbertSchildt;

import static java.lang.Character.toLowerCase;

public class ConvertingCapitalLettersToSmallLetters {
    public static void main(String[] args) {
        char ch = 'A';

        for(; ch <='Z'; ch++){

            System.out.print ( toLowerCase(ch)  + "\t" );

        }
}}