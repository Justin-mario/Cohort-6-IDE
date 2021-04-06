package HerbertSchildt;

public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        try{
            numbers[3] = 20;
            System.out.println (numbers[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println ("index out of bound");
        }
    }
}
