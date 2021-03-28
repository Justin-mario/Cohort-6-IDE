package fromchapter6;

public class ReverseNumbers {
    public static void main(String[] args) {

        String name = "1223344566";
        int length = name.length ();
        char[] letters = name.toCharArray ();
        for (int counter = 0; length > counter; length--){
            System.out.printf (letters[length -1] + "" );
        }
    }
}
