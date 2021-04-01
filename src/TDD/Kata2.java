package TDD;

public class Kata2 {

    public static int getMaximum(int[] arrays) {

     int maximumNumber =  arrays[0];
     int counter = 0;
     while(counter < arrays.length){
         if(arrays[counter] > maximumNumber){
             maximumNumber = arrays[counter];
         }
         counter++;
     }
        return maximumNumber;
    }

    public static int getMinimum(int[] arrays) {

        int minimumNumber =  arrays[0];
        int counter = 0;
        while(counter < arrays.length){
            if(arrays[counter] < minimumNumber){
                minimumNumber = arrays[counter];
            }
            counter++;
        }
        return minimumNumber;
    }

    public static int getSum(int[] arrays) {
        int sum = 0;
        int counter = 0;
        while(counter < arrays.length){
            sum += arrays[counter++]; }
        return sum;
    }

    public static int getAverage(int[] arrays) {

        return  getSum ( arrays )/arrays.length;
    }
}
