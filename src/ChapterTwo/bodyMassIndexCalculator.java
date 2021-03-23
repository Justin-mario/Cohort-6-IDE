package ChapterTwo;

import java.util.Scanner;

public class bodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight;
        int height;

        System.out.print("Input weight in pounds: ");
        weight = input.nextInt();
        System.out.print("Input height in inches: ");
        height = input.nextInt();
        int bmi = (weight * 703) / (height * height);
        System.out.printf("BMI: %d%n", bmi);
        if (bmi < 18.5){
            System.out.println("UnderWeight");
        }
        if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("weight is Normal");}
        if(bmi >= 25 && bmi <= 29.9){
            System.out.println("Overweight");
        }
        if(bmi > 30){
            System.out.println("Obese");
        }
        //System.out.println("B.M.I is: " + (weight * 703) / (height * height));
        System.out.println("Underweight: less than 18.5\nNormal: between 18.5 and 24.9\n " +
                "Overweight: between 25 and 29.9\nObese: 30 or greater");

    }
}
