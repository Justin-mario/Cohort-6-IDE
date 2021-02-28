package javaClass;

import java.util.Scanner;

public class studentAverage3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade ;
        double average = 0;
        double gradeCounter = 1;

        do {
            System.out.println("Input Grade: ");
            grade = input.nextDouble();
            average = average + grade;
            gradeCounter++;
        } while (gradeCounter <= 10);

        double totalAverage = (average/10);
        System.out.println("Average is: " +  totalAverage);
    }
}
