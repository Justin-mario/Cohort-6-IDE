package ChapterSix;

import java.util.Scanner;

public class TemperatureConverter {
    public static void fahrenheitToCelsius(double fahrenheit){
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.println (fahrenheit + "\tfahrenheit is\t" + celsius + "\tdegree celsius");
    }
    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println (celsius + "\tdegree celsius is\t" + fahrenheit + "\tfahrenheit");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int userChoice;

        String prompt = """
                -> Press 1 to Convert celsius to fahrenheit.
                -> press 2 to convert fahrenheit to celsius. """;
        System.out.println (prompt);

        userChoice = input.nextInt ();
        switch (userChoice) {
            case 1 -> {
                System.out.print ( "Input celsius value to convert to fahrenheit: " );
                double celsius = input.nextDouble ();
                celsiusToFahrenheit ( celsius );
            }
            case 2 -> {
                System.out.println ( "Input fahrenheit value to convert to celsius: " );
                double fahrenheit = input.nextDouble ();
                fahrenheitToCelsius ( fahrenheit );
            }
            default -> System.out.println ( "Choice is Between 1 and 2" );
        }
    }
}
