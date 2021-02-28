package javaClass;

import java.util.Scanner;

public class studentAverage2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade;
        double average = 0;
        double gradeCounter = 1;

        for (  ;gradeCounter <= 10; gradeCounter++)
        {
            System.out.println("Input Grade: ");
            grade = input.nextDouble();
            average = average + grade;
        }
            double totalAverage = (average / 10);
            System.out.println("Average is: " + totalAverage);

        }

    }




