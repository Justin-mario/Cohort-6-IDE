package fromchapter6;

public class ForLoopArray {
    public static void main(String[] args) {
       String[] studentNames = {"john", "isaac", "ben", "jane"};
        for(String students: studentNames){

            System.out.println ( students);
        }

        int[] grades = {1,3,5,7,9};
        int sum = 0;
        for(int grade: grades) {
            sum+=grade;
        }
            System.out.printf ( "sum is: %d", sum );


    }


}
