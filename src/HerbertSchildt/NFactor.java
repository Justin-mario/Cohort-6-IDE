package HerbertSchildt;

public class NFactor {
    public static void main(String[] args) {
        int n = 10;
        int d = 2;

        if(d != 0 && n % d == 0){
            System.out.println ( d + "is a factor of " + n);
        }

    }
}
