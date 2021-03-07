package TDD;

import java.util.Optional;
import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM userAccount = new ATM();
        System.out.println(" Welcome Dear Customer Please Input Your PIN to Continue");
        int pin = input.nextInt();

        if (pin != userAccount.getPin()) {
            System.out.println(" Invalid pin");
        } else {
            String prompt = """
                    --> press 1 to Deposit
                    --> press 2 to Withdraw
                    --> press 3 to check Account Balance
                    --> press 4 to Exit.
                    """;
            System.out.println(prompt);
            int userChoice = 0;

            while (userChoice != 4) {
                System.out.println(" Choose An Option");
                userChoice = input.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println("Deposit: ");
                        double amountToDeposit = input.nextDouble();
                        if (amountToDeposit < 0) {
                            System.out.println("Enter a valid amount");
                            break;
                        } else
                            userAccount.deposit(amountToDeposit);
                        break;

                    case 2:
                        System.out.println("Enter Pin: ");
                        pin = input.nextInt();
                        if (pin != userAccount.getPin()) {
                            System.out.println("Invalid Pin");
                            break;
                        } else
                            System.out.println("Enter amount To Withdraw");
                        double amountToWithdraw = input.nextDouble();
                        if (amountToWithdraw < 0) {
                            System.out.println(" Enter A Valid Amount");
                            break;
                        } else
                            userAccount.withdraw(amountToWithdraw, pin);

                    case 3:
                        System.out.println("Balance is : " + userAccount.getBalance());
                        break;

                    case 4:

                        System.out.println("Thank You For Banking With US");


                }

            }


        }

    }
}

