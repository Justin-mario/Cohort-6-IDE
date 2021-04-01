package javaClass;

public class newAccount {
    private String accountName;
    private String accountNumber;
    private double accountBalance;
    private double withdrawFromAccount;
    private double depositToAccount;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setDepositToAccount(double depositToAccount) {
        if(depositToAccount > 0 ){
        this.depositToAccount = depositToAccount;}
        else{
            System.out.println("Invalid Amount");
        }
    }

    public double getDepositToAccount() {
        return depositToAccount;
    }

    public double getAccountBalance() {
        if(depositToAccount > 0){
        accountBalance = accountBalance + depositToAccount;}

        if(withdrawFromAccount > 0 &&  withdrawFromAccount < accountBalance){
            accountBalance = accountBalance - withdrawFromAccount;
        }
        else{
            System.out.println("Insufficient Account Balance");
        }
        return accountBalance;
    }

    public void setWithdrawFromAccount(double withdrawFromAccount) {
        if (withdrawFromAccount > 0 && withdrawFromAccount < accountBalance) {
            this.withdrawFromAccount = withdrawFromAccount;
        } else {
            System.out.print(" insufficient balance");
        }
    }
    public double getWithdrawFromAccount() {
        return withdrawFromAccount;
    }
}
