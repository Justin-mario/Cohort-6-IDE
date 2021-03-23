package ChapterFour;
import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input Digits");
        int firstDigit = input.nextInt();

        int secondDigit = input.nextInt();

        int thirdDigit = input.nextInt();

        if(firstDigit == thirdDigit){

            System.out.println("It is a Palindrome" + firstDigit + secondDigit + thirdDigit); }
        if(firstDigit != thirdDigit){
            System.out.println("it is not a Palindrome" + firstDigit + secondDigit + thirdDigit);}

    }
}
