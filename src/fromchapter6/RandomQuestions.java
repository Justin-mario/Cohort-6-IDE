package fromchapter6;

import java.security.SecureRandom;

public class RandomQuestions {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        for (int counter = 1; counter <= 10; counter++) {
            int number1 = randomNumbers.nextInt(10);
            int operator = randomNumbers.nextInt();

            System.out.printf("%d ", number1);
        }
    }
}