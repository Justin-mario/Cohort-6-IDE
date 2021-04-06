package HerbertSchildt;

public class MultiCatchException {
    public static void main(String[] args) {
        int[] firstArray = {20,18,24,60,45,60};
        int[] secondArray = {10,0,6, 20};

        for (int counter = 0; counter < firstArray.length; counter++){
            try {
                System.out.println (firstArray[counter]/secondArray[counter]);

            }
            catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
                System.out.println ("Some Exception Caught " + e);
            }

        }
    }
}
