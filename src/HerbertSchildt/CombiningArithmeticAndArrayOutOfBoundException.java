package HerbertSchildt;

public class CombiningArithmeticAndArrayOutOfBoundException {
    public static void main(String[] args) {
        int[] firstArray = {20,18,24,60,45,60};
        int[] secondArray = {10,0,6, 20};

        for (int counter = 0; counter < firstArray.length; counter++){
            try {
                System.out.println (firstArray[counter]/secondArray[counter]);

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println ("Index out of bound");
            }
            catch (ArithmeticException e){
                System.out.println ("Can not be divided by zero");
            }
        }
    }
}
