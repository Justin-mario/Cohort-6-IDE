package ChapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private double weight;
    private double height;
    private int age;
    private int yearOfBirth, monthOfBirth, dayOfBirth;
    private int maximumHeartRate;
    private String  targetHeartRate;

    public HealthProfile(String firstName, String lastName, String gender){

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender) {
        if (gender == "Male") {
            this.gender = gender;
            if (gender == "Female") {
                this.gender = gender;}
             else
                 this.gender = "Default";
            }
            this.gender = gender;
        }


    public String getGender(){
        return gender;
    }

    public void setWeight(double weight){
        if(weight > 0)
            this.weight = weight;
        else
            weight = 0.0;
    }
    public double getWeight(){

        return weight;
    }

    public void setHeight(double height){
        if(height > 0)
            this.height = height;
        else
            height = 0;
    }

    public double getHeight(){
        return height;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if(dayOfBirth > 0){
            this.dayOfBirth = dayOfBirth; }
        else {
            dayOfBirth = 0; }

    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth){
        if(monthOfBirth > 0){
            this.monthOfBirth = monthOfBirth;}
        else{
            monthOfBirth = 0;
        }

    }

    public int getMonthOfBirth(){
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        if(yearOfBirth > 0){
        this.yearOfBirth = yearOfBirth;}
        else{
            yearOfBirth = 0; }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setAge(int age){


        this.age = age;
    }

    public int getAge() {
        age = 2021 - yearOfBirth;
        return age;
    }
    public double getBMI(){
       double bmi = (weight * 703) / (height * height);
       return bmi;
        }


        public int getMaximumHeartRate(){
        maximumHeartRate = 220 - age;
        return  maximumHeartRate;
        }
    public String getTargetHeartRate(){
        double targetHeartRate1 = 0.5 * maximumHeartRate;
        double targetHeartRate2 = 0.85 * maximumHeartRate;
        return targetHeartRate1 + " - " +targetHeartRate2;

    }
}
