package fromchapter6;

public class AssigningArrayValues {
    public static void main(String[] args) {
      final int ARRAY_LENGTH = 10;
      int[] array = new int[ARRAY_LENGTH];
      int counter = 0;
      int count = 0;

      while(counter < array.length) {
          array[counter] = 1 + 2 * counter;
          counter++;}

          System.out.printf ( "%s%10s%n", "INDEX", "VALUE" );
      while(count < array.length){
          System.out.printf ( "%3d%10d%n", count, array[count++] );}




    }
}
