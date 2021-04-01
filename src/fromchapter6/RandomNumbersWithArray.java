package fromchapter6;

import java.security.SecureRandom;

public class RandomNumbersWithArray {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] arrays = new int[6];
        for(int counter = 0; counter <= 60000000;counter++) {
            int face = 1 + randomNumbers.nextInt ( 6 );
            System.out.printf ( "%d ", face );
            if (counter % 5 == 0)
                System.out.println ();

        }

    }
}
