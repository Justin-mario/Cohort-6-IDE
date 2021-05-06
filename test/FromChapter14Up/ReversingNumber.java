package FromChapter14Up;

import org.junit.jupiter.api.Test;

public class ReversingNumber {
    @Test
    void reverseString(){
        String initial = "68573565 234";
        StringBuilder reversed = new StringBuilder (initial.substring ( initial.length ()-3 ));
        reversed.append ( ") " );
        reversed.insert ( 0,"(+" );
        int count = 0;
        for (int i = initial.length () - 5; i >= 0; i--){

            //if (count == 3){
            if (count % 3 == 0 && count > 0){
                //count = 0;
                reversed.append ( "-" );
            }
            reversed.append ( initial.charAt ( i ) );
            count++;
        }
        System.out.println (reversed);
    }
}
