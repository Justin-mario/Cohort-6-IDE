package ChapterFour;

public class CheckerBoardPatternOfAsterisks {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 64){
                    System.out.print ( " * " );

                        if(counter == 7 || counter == 15 || counter == 23 || counter == 31 || counter == 39 ||
                        counter == 47 || counter == 55){
                            System.out.println ();
                        }
                            if(counter == 7|| counter == 23 || counter == 39 ||
                                 counter == 55){
                                System.out.print ( " " );}


       counter++;}
    }
}
