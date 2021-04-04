package ChapterTwo;

public class SeparatingIntegers {
    public static void main(String[] args) {
        // for 5 digits
        int numbers = 42339;
        int number1 = numbers / 10000;
        int number2 = numbers % 10000;
        int number3 = number2 / 1000;
        int number4 = number2 % 1000;
        int number5 = number4 / 100;
        int number6 = number4 % 100;
        int number7 = number6 / 10;
        int number8 = number6 % 10;

        System.out.println (number1+ " " + number3 + " " + number5 + " " + number7 + " " + number8);

        // more than 5 digits

        int mainNumber = 643879;
        int firstNumber = mainNumber / 100000;
        int secondNumber = mainNumber % 100000;
        int thirdNumber = secondNumber / 10000;
        int fourthNumber = secondNumber % 10000;
        int fifthNumber = fourthNumber / 1000;
        int sixthNumber = fourthNumber % 1000;
        int seventhNumber = sixthNumber / 100;
        int eightNumber = sixthNumber % 100;
        int ninthNumber =  eightNumber / 10;
        int tenthNumber = eightNumber % 10;


        System.out.println (firstNumber + " " +  thirdNumber + " " + fifthNumber + " " + seventhNumber + " " +
                ninthNumber + " " + tenthNumber);
    }
}
