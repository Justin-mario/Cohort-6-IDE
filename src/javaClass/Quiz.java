package javaClass;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double totalGrade = 0;
        double Average = 0;
        int counter = 1;
        while(counter <= 5){
            System.out.println("Input Grade: ");
            grade = input.nextDouble();
            totalGrade = totalGrade + grade;
            counter++;}
           // totalGrade = totalGrade + grade;}
            System.out.println( "Total is: "+ totalGrade + "Average is: " + totalGrade/counter
            );


    }
}
