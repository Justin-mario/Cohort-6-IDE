package fromchapter6;

public class PrintingArrayRowsAndColumnWithForEachLoop {
    public static void main(String[] args) {
        int[][] tableOfArrays = {{2,6,9,20,9,100}, {34,9,80,78,9},{30,34,89,90,9}};
        int firstArray,secondArray;

         for(firstArray = 0; firstArray < tableOfArrays.length; firstArray++ )
             for (secondArray = 0; secondArray < tableOfArrays[firstArray].length; secondArray++)
                System.out.print (tableOfArrays[firstArray][secondArray] + "  ");

    }
}
