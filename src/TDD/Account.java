package TDD;

public class Account {

    double balance;
    int pin;

    public void depositMoney(double amount) {
        if(amount >= 0){
        balance += amount;}
        amount = 0;
    }


    public double getAccountBalance() {
        return balance;


    }

    public void setPin(int newPin) {
        pin = newPin;

    }

    public void withDrawMoney(double amountToWithdraw, int pin) {
        if(pin == this.pin){
        balance -= amountToWithdraw;}
    }
}
