package HerbertSchildt;

public class FindingMaxMinWithLoop {
    public static void main(String[] args) {
        int min,max;
        int[] numbers = new int[10];
        numbers[0] = 99;
        numbers[1] = -10;
        numbers[2] = 100123;
        numbers[3] = 18;
        numbers[4] = -978;
        numbers[5] = 5623;
        numbers[6] = 463;
        numbers[7] = -9;
        numbers[8] = 287;
        numbers[9] = 49;
        min = max = numbers[0];

        for (int table : numbers) {
            if (table < min)
                min = table;
              if (table > max)
                max = table;

        }
        System.out.println ( "Minimum Number is: " + min + "\t\tMaximum Number is: "+ max );
    }
}
