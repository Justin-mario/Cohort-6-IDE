package HerbertSchildt;
public class UsingArrayToFindAverageOfTenNumbers {
    public static void main(String[] args) {
        double average;
        double sum = 0;
        int[] numbers = {2,4,3,7,8,9,11,1,14,15};
        for (int arrayElement : numbers)
            sum += arrayElement;
            average = sum/numbers.length;
        System.out.print ( average );
    }

}
