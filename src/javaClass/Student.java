package javaClass;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    public void setStudentName(String sName){
        name = sName;
    }
    public String getStudentName(){
        return name;
    }
    public void setGrade(double sGrade){
       if(grade <= 0.0)
           if(grade <= 100.0)
        grade = sGrade;
    }
    public double getGrade(){

        return grade;
    }
    public String getLetterGrade(){
        String letterGrade = "";
        if(grade >= 90) {
            letterGrade = "A";
        }
            else if(grade >= 80){
                letterGrade = "B";
        }
            else if(grade >= 70){
                letterGrade = "c";
        }
            else if (grade >= 60){
                letterGrade = "D";
        }
            else{
             letterGrade = "F";
        }
            return letterGrade;
    }

    }


