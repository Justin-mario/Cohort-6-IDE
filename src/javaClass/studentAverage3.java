package javaClass;

import java.util.Scanner;

public class studentAverage3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = 0 ;
        double average = 0;
        double gradeCounter = 1;

        do {
            System.out.println("Input Grade: ");
            grade = input.nextDouble();
            if(grade >= 0){
            average = average + grade;
            gradeCounter++;}
            else
                System.out.println("Grade must not be less than 0");
        } while (gradeCounter <= 10);

        double totalAverage = (average/10);
        System.out.println("Average is: " +  totalAverage);
    }
}
