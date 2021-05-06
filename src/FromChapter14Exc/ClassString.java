package FromChapter14Exc;

import java.util.Arrays;

public class ClassString {

    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String name = "hello";
        String newName = "hello";

        String name2 = new String ();
        String name3 = new String (name);
        String name4 = new String (charArray);
        String name5 = new String (charArray, 6, 3);
        char[] anotherCharArray = new char[5];

        System.out.printf (" name2 = %s%n name3 = %s%n name4 = %s%n name5 = %s%n", name2, name3, name4, name5);
        for (int i = name.length ()-1; i >= 0; i--){
            System.out.printf ("%s", name.charAt ( i ));
        }
        name.getChars ( 0,5, anotherCharArray,0 );
        System.out.println ("\n" + Arrays.toString ( anotherCharArray ) );
        System.out.println (name.concat ( name5 ));

        /*System.out.println (name4.length ());
        System.out.println (name.equals ( name3 ));
        System.out.println (name == name3);
        System.out.println (name == newName);
        System.out.println (name.equals ( newName ));*/
    }
}
