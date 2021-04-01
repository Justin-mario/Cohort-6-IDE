package ChapterThree;

public  class AccountToDisplayNameAsMethod {
    private String name;
    private double balance;
    private double withdraw;

    public AccountToDisplayNameAsMethod(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;}
        else{
            System.out.print("input valid number");
        }

    }




    public void deposit(double depositAmount) {
        if (depositAmount < 0)
        {
            System.out.println("Input valid number Enter a valid amount");
            depositAmount = 0.0;
        }
        else {
            balance = balance + depositAmount;
        }
    }


    public double getBalance() {
        balance = balance - withdraw;
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWithdraw(double withdraw) {
        if (withdraw <= balance && withdraw > 0) {
            this.withdraw = withdraw;
        }
        else
        {
            System.out.println("Withdrawal amount exceeded account balance");
            withdraw = 0;
        }
    }
    public static String  displayAccount(String name, double balance){
        return name + " - " + balance;

    }
}

