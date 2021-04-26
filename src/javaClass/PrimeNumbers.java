package javaClass;

public class PrimeNumbers {
    public static void main(String[] args) {
        int primeNumber = 0;
        int number = 2;
        int nonPrimeNumber = 0;
        for (int divisor = 2; divisor < 100; ){
            number++;
            if(number % divisor == 0 ){
               primeNumber++;
            }
            else
                nonPrimeNumber++;

            divisor++;
        }
        System.out.println (primeNumber +"\n " + nonPrimeNumber + " \n" + number);
    }
}
