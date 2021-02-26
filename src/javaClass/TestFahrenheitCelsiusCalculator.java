package javaClass;
import java.util.Scanner;
public class TestFahrenheitCelsiusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            CelsiusFahrenheitCalculator test = new CelsiusFahrenheitCalculator();

            System.out.print("Enter Celsius: ");
           double collect = input.nextDouble();

           System.out.println("Celsius: "  + collect +  "  Fahrenheit:" + test);


    }
}

