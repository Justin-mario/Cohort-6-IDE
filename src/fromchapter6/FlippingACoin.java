package fromchapter6;

import java.security.SecureRandom;

public class FlippingACoin {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        for(int counter = 1; counter <= 5; counter++) {
            int face = 1 + randomNumbers.nextInt ( 2 );
            System.out.printf ( "%d ", face );
                System.out.println ();
        }
    }
}
