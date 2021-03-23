package ChapterFive;



public class CalculatingTheProductOfOddIntegers {
    public static void main(String[] args) {
        int total = 0;

        for(int numberCounter = 1; numberCounter <=15; numberCounter++){
            if(numberCounter % 2 == 1)
                total = total + numberCounter;
                 }
                System.out.println ( "Product Of All Odd Integers BTW 1 and 15: " + total );


        }
    }

