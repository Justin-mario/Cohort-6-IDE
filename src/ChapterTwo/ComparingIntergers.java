package ChapterTwo;

import java.util.Scanner;

public class ComparingIntergers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter First Number ");
        int number1 = input.nextInt();
        System.out.print(" Enter Second Number: ");
        int number2 = input.nextInt();

            if(number1 > number2 ){
                System.out.println(number1 + " Is Larger"); }
            if(number2 > number1){
                System.out.println(number2 + " Is Larger"); }
            if(number1 == number2){
                System.out.println(" These Numbers Are Equal"); }


    }
}
