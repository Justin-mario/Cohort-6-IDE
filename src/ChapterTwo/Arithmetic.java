package ChapterTwo;

import java.util.Scanner;
	
	public class Arithmetic{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum, product, difference, quotient;


	System.out.print("First Number: ");
	number1 = input.nextInt();
	System.out.print("Second NUmber: ");
	number2 = input.nextInt();

	sum = number1 + number2;
	product = number1 * number2;
	difference = number1 - number2;
	quotient = number1 %  number2;
	System.out.println("Sum:  " + sum +   "    Product is:  " + product + "  Difference is:  " +
			difference + "  Quotient is:  "+ quotient);

	
	/*System.out.print("First Number:");
	num1 = input.nextInt();
	
	System.out.print("Second NUmber:");
	num2 = input.nextInt();

	sum = num1 / num2; 
	System.out.printf("Sum: %d%n", sum);

	
	System.out.print("First Number:");
	num1 = input.nextInt();
	

	System.out.print("Second NUmber:");
	num2 = input.nextInt();

	sum = num1 % num2; 
	System.out.printf("Sum: %d%n", sum);*/

	}
	}
		