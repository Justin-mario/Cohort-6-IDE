package javaClass;

public class TestStudent {
    public static void main(String[] args) {
        Student Score = new Student("Emeka John", 90);
        Student Score2 = new Student("Ene Peter", 80);
        double average;

        System.out.println(Score.getStudentName() + "Student Details " + Score.getLetterGrade());
        System.out.printf("%s Student Details %s%n", Score2.getStudentName(), Score2.getLetterGrade());
        System.out.println(average = Score.getGrade() + Score2.getGrade() / 2);
        if((Score.getGrade() + Score2.getGrade())% 2 == 1)
            System.out.println("It is odd Number");
        else
            System.out.println("It is even Number");
        }

    }

