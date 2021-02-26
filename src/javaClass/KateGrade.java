package javaClass;

public class KateGrade {
    public String calculateGrade(int studentScore) {
        if (studentScore >= 90) {
            return "A";
        } else if (studentScore >= 80) {
            return "B";
        } else if (studentScore >= 70) {
            return "C";
        } else {
            return "F";
        }

    }

    public boolean isEvenNumber(int checkEvenNumber) {
        if (checkEvenNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

        }


