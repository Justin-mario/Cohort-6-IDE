package javaClass;

import java.util.Scanner;

public class newAccountTest {
    public static void main(String[] args) {
        Scanner collectUserInput = new Scanner(System.in);

        newAccount userAccount = new newAccount();

        System.out.print("Enter Account Name: ");
        String newAccountName = collectUserInput.nextLine();
        userAccount.setAccountName(newAccountName);

        System.out.print("Enter Account Number: ");
        String newAccountNumber = collectUserInput.nextLine();
        userAccount.setAccountNumber(newAccountNumber);

        System.out.print("Enter Amount To Deposit: ");
        double newDeposit = collectUserInput.nextDouble();
        userAccount.setDepositToAccount(newDeposit);

        System.out.print("Enter Amount To Withdraw: ");
        double newWithdraw = collectUserInput.nextDouble();
        userAccount.setWithdrawFromAccount(newWithdraw);

        System.out.println("Account Name: " + userAccount.getAccountName());
        System.out.println("Account Number: " + userAccount.getAccountNumber());
        System.out.println("Amount Deposited: " + userAccount.getDepositToAccount());
        System.out.println("Account Balance: " + userAccount.getDepositToAccount());
        System.out.println("Amount Withdrawn: " + userAccount.getWithdrawFromAccount());
        System.out.println("Account Balance: " + userAccount.getAccountBalance());

    }
}
