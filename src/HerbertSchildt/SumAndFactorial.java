package HerbertSchildt;

public class SumAndFactorial {
    public static void main(String[] args) {
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= 5; i++){
            sum += i;
            factorial *= i;
        }
        System.out.printf ( "%s%d%s%d%n", "sum is\t", sum, "\tfactorial is:\t", factorial);
    }
}
