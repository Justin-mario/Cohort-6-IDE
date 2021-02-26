package javaClass;

import java.util.Scanner;

public class NewAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int grade = 0;
        int totalGrade = 0;
        int counter = 0;
        System.out.println("Enter grade or -1 to end: ");
       int grade = input.nextInt();
        while(grade != -1) {
            totalGrade = totalGrade + grade;
            counter = counter + 1;
            System.out.println("Enter grade or -1 to end: ");
            grade = input.nextInt();
        }
                if(counter != 0){
                    System.out.println("Average is: " + (double) totalGrade/counter + "Total is: " + totalGrade + counter);}
                else
                    System.out.println("input valid number");

        }
    }

