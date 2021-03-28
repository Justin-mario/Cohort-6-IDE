package HerbertSchildt;

public class FindingMaximumAndMinimumNumberOfArray {
    public static void main(String[] args) {
        int [] arrays = {34,56,9,-1,20,23,34,98,90,12};
        int maximum,minimum,counter;
        minimum = maximum = arrays[0];
        for (counter = 1; counter < 10; counter++) {
            if (arrays[counter] > maximum) maximum = arrays[counter];
            if (arrays[counter] < minimum) minimum = arrays[counter];
        }
        System.out.println ("Maximum array:\t" + maximum + "\tMinimum array is:\t" + minimum );


    }
}
