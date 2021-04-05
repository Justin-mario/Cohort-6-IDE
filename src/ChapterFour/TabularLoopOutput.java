package ChapterFour;

public class TabularLoopOutput {
    public static void main(String[] args) {
        System.out.println ("N\t"+ "10*N "+ "100*N " + "1000*N");
        for (int counter = 1; counter <= 3;){
                System.out.print ( counter + "\t" );
                counter *= 10;
                System.out.print (counter+ "\t ");
                counter *= 10;
                System.out.print ( counter + "\t" );
                counter *= 10;
                System.out.println ( counter + "\t" );
                counter++;
            }

        for (int counter = 2; counter <= 4;){
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.print (counter+ "\t ");
            counter *= 10;
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.println ( counter + "\t" );
            counter++;
        }

        for (int counter = 3; counter <= 5;){
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.print (counter+ "\t ");
            counter *= 10;
            System.out.print ( counter + " \t" );
            counter *= 10;
            System.out.println ( counter + "\t" );
            counter++;
        }

        for (int counter = 4; counter <= 7;){
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.print (counter+ "\t ");
            counter *= 10;
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.println ( counter + "\t" );
            counter++;
        }

        for (int counter = 5; counter <= 8;){
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.print (counter+ "\t ");
            counter *= 10;
            System.out.print ( counter + "\t" );
            counter *= 10;
            System.out.println ( counter + "\t" );
            counter++;
        }
    }
}
