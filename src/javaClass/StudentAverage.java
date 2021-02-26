package javaClass;
import java.util.Scanner;
public class StudentAverage {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double grade ;
           double average = 0;
           double totalNumberGrade=0;
           while (totalNumberGrade < 10) {
               System.out.println("Enter Grade");
               grade = input.nextDouble();
               average = average + grade;
               totalNumberGrade++;
           }
           double totalAverage = (average/totalNumberGrade);
           System.out.println("Average is:" + totalAverage);
        }

}
