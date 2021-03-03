package ChapterTwo;

import java.util.Scanner;
	public class OddOrEven{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		int num1;
		int num3;
		
		
	System.out.print("Enter No:");
	num1 = input.nextInt();	

	int num2 = num1 % 2;

	if(num2 == 0)
	System.out.printf("%d Is even No.", num2);

	if(num2 != 0)
	System.out.printf("%d Is Odd No.", num2);

	System.out.print("Enter Another No:");
	num3 = input.nextInt();	
	
	 num2 = num3 % 2;

	if(num2 == 0)
	System.out.printf("%d Is even No.", num2);

	if(num2 != 0)
	System.out.printf("%d Is Odd No.", num2);
	

	}
	}