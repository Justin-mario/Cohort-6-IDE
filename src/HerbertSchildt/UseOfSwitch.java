package HerbertSchildt;

public class UseOfSwitch {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            switch (i) {
                case 0 -> System.out.println ( "is is 0" );
                case 1 -> System.out.println ( "i is 1" );
                case 2 -> System.out.println ( "i is 2" );
                case 3 -> System.out.println ( "i is 3" );
                case 4 -> System.out.println ( "i is 4" );
                default -> System.out.println ( "i is above 4 \n but between 1 to 10" );
            }
        }
    }
}
