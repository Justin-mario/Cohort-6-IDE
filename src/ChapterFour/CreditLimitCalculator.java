package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        int accountNumber;
        int beginningOfTheMonthBalance;
        int totalItemChargedByCustomer;
        int totalCreditAppliedToCustomerAccount;
        int allowedCreditLimit;
        int counter = 0;

        Scanner input = new Scanner ( System.in );
        while(counter != -1){

            System.out.println ( "Enter -1 to Exit" );
        System.out.print ( "Enter Account Number: " );
        accountNumber = input.nextInt ();
        System.out.print ( "Enter new Month Balance: " );
        beginningOfTheMonthBalance = input.nextInt ();
        System.out.print ( "Enter total Item Charged By customer: " );
        totalItemChargedByCustomer = input.nextInt ();
        System.out.print ( "Enter Total Credit Applied To Customer: " );
        totalCreditAppliedToCustomerAccount = input.nextInt ();
        System.out.print ( "Enter Allowed Credit Limit: " );
        allowedCreditLimit = input.nextInt ();

        int newBalance = beginningOfTheMonthBalance + totalItemChargedByCustomer - totalCreditAppliedToCustomerAccount;
        System.out.println ("Account Number:  "+ accountNumber + "\nBeginning Of The Month Balance:  " + beginningOfTheMonthBalance +
              "\nTotal Item Charged By Customer:  " + totalItemChargedByCustomer + "\nTotal Credit Applied To Customer:  " +
               totalCreditAppliedToCustomerAccount + "\nNew Balance: " + newBalance );
        if(newBalance > allowedCreditLimit) {
            System.out.println ( "Credit Limit Exceeded" + "\nLimit is: " + allowedCreditLimit );
            System.out.println ( "" );
        }
        }
    }
}
