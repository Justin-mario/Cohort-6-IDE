package ChapterThree;

import java.util.Scanner;

public class AccountToDisplayNameAsMethodTest {
    public static void main(String[] args) {
        ModifiedAccountClass account1 = new ModifiedAccountClass("Jane Green", 50.00);
        ModifiedAccountClass account2 = new ModifiedAccountClass("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawAmount = input.nextDouble();
        account1.setWithdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();


        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.println("Enter withdrawal amount for account2: ");
        withdrawAmount = input.nextDouble();


        System.out.printf("%n withdrawing %.2f from account2 balance%n%n", withdrawAmount);
        account2.setWithdraw(withdrawAmount);
       // System.out.println ( "Account Name:" + AccountToDisplayNameAsMethod.displayAccount ( account1, ) );
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }


}
