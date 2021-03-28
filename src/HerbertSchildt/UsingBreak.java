package HerbertSchildt;

public class UsingBreak {
    public static void main(String[] args) {
    dance:
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    System.out.print ( k +"\t");
                    if(k==2)
                    break dance;
                }
                System.out.println ( j + "\t" );
            }
            System.out.println ( i + "\t" );
        }
    }
}
