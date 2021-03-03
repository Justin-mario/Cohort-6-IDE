package ChapterThree;

public class Employee{
		private String firstName;
		private String secondName;
		private double monthlySalary;
		private double yearSalary;
		private double yearIncreament;
	public Employee(String fName, String sName, double mSalary, double ySalary, double yIncreament){
		firstName = fName;
		secondName = sName; 
		monthlySalary = mSalary;
		yearSalary = ySalary;

		
		yearIncreament = yIncreament;
		
			}

	public void setFirstName(String fName){
		firstName = fName; }

	public String getFirstName(){
		return firstName; }

	public void setSecondName(String sName){
		secondName = sName; }

	public String getSecondName(){

		return secondName; }

	public void setMonthlySalary(double mSalary){
	
	monthlySalary = mSalary; }
		

	public double getMonthlySalary(){
		return monthlySalary; }
	

	public  double getYearSalary(){
		if(monthlySalary != 0)
		yearSalary = monthlySalary * 12;

		return yearSalary;}

	public double getYearIncreament(){

		yearIncreament = yearSalary * 10;
		return yearIncreament; }

	
		 

	}
	
		