package javaClass;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        int pass = 0;
        int fail = 0;
        int counter = 0;

        while(counter <= 4){
            System.out.println("Input Result:");
            grade = input.nextInt();
                if (grade == 1)
                    pass = pass + 1;
                else
                    fail = fail + 1;
                counter++;
        }
        System.out.println("pass " + pass + " fail " + fail);
            if(pass >= 3){
                System.out.println("Bravo Bonus To Instructor");}
            else{
                System.out.println("Too bad");}
    }
}
