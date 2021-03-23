package ChapterThree;

public class TargetHeartRateCalculator {
    private String firstName;
    private String lastName;
    private int age;
    private int yearOfBirth, monthOfBirth, dayOfBirth;
    private int maximumHeartRate;
    private String  targetHeartRate;

    public TargetHeartRateCalculator(String firstName, String lastName){

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
