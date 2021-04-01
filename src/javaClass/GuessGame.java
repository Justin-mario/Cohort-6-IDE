package javaClass;
import java.util.Scanner;
    public class GuessGame {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int answer = 100;
            int guess;
            int count = 0;

            System.out.print("Guess!  ");
            guess = input.nextInt();

            for ( ;guess != answer; count++) {
                if(guess < answer)
                System.out.println(" Wrong!!! Take Another Guess!  " + "Answer is more than" + guess);
                System.out.println();
                guess = input.nextInt();
                if (guess > answer)
            System.out.println("Wrong Answer is less than " + guess);}
                System.out.println();
                System.out.println("correct" + answer);

                    }


            }



