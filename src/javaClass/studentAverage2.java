package javaClass;

import java.util.Scanner;

public class studentAverage2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade = 0;
        double average = 0;
        double gradeCounter = 1;

        for (  ;gradeCounter <= 10; ) {
            System.out.println("Input Grade: ");
            grade = input.nextDouble();
            if (grade >= 0) {
                average = average + grade;
                gradeCounter++; }
             else {
                System.out.println("Grade can not be less than zero");}

        }
            double totalAverage = (average / 10);
            System.out.println("Average is: " + totalAverage);


        }

    }




