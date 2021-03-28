package fromchapter6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer> ();
        grades.add ( 20 );
        grades.add ( 30 );
        grades.add ( 60 );
        grades.add ( 2,200 );
        grades.add ( 1 );
        grades.add ( 5 );
        Collections.sort ( grades );
        try{
            grades.remove ( 10 );
        }
        catch (Exception e){
            System.out.println ( "index length is less" );
        }
        finally {
            grades.add ( 500 );
        }
        for (Integer number:grades
             ) {
            System.out.println ( number );

        }
        System.out.print ( grades.size () );

    }
}
