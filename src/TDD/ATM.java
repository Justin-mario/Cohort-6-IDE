package TDD;

public class ATM {
    private double balance;
    private int pin = 1759;
    public void deposit(double amount) {
        if(amount > 0)
    balance = balance + amount;
    }

    public double getBalance() {

        return balance;
    }

    public void withdraw(double amount, int pin) {
        if(this.pin == pin)
        if(amount > 0 && balance > amount )
        balance = balance - amount;
    }

    public void setPin(int pin) {
    this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}
