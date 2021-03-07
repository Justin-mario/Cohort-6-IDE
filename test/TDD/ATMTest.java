package TDD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM userAccount = new ATM();
    @Test
    @DisplayName("Customer Can Deposit Money")

     void customerCanDeposit(){
        userAccount.deposit(6000);
        double balance = 6000;
        assertEquals(balance, userAccount.getBalance());
    }

    @Test
    @DisplayName("Customer can Deposit Twice")
        void customerCanDepositTwice(){
        userAccount.deposit(5000);
        userAccount.deposit(7000);
        double balance;
        assertEquals(12000, userAccount.getBalance());

    }

    @Test
    @DisplayName("Customer Can Withdraw")
        void withdrawMoneyFromATM(){
        double balance = 5000;
        userAccount.deposit(10000);
        userAccount.setPin(2222);
        userAccount.withdraw(5000, 2222);
        assertEquals(balance, userAccount.getBalance());

    }

    @Test
    @DisplayName("Customer Can Not Deposit An Amount less Than Zero")
        void depositAmountLessThanZero(){
        userAccount.deposit(-10000);
        double balance = 0.0;
        assertEquals(balance, userAccount.getBalance());
    }

    @Test
    @DisplayName("Customer Can not Withdraw amount less than Zero")
    void withdrawAmountLessThanZeroMoneyFromATM(){
        double balance = 10000;
        userAccount.deposit(10000);
        userAccount.withdraw(-5000, 2222);
        assertEquals(balance, userAccount.getBalance());


    }
    @Test
    @DisplayName("Customer Can not Withdraw more than Account Balance")
    void withdrawMoreThanBalanceMoneyFromATM(){
        double balance = 10000;
        userAccount.deposit(10000);
        userAccount.withdraw(20000,2222);
        assertEquals(balance, userAccount.getBalance());

    }

    @Test
    @DisplayName("Customer Can Login With Pin")
    void loginWithPin(){
        userAccount.setPin(2222);
        int pin = 2222;
        assertEquals(pin, userAccount.getPin());

    }

    @Test
    @DisplayName("Customer Can withdraw with correct pin")
    void withdrawWithCorrectPin(){
        double balance = 5000;
        userAccount.deposit(10000);
        userAccount.setPin(2222);
        userAccount.withdraw(5000, 2222);
        assertEquals(balance, userAccount.getBalance(), userAccount.getPin());

    }

    @Test
    @DisplayName("Customer Can not withdraw with incorrect pin")
    void withdrawWithinCorrectPin(){
        double balance = 10000;
        int pin = 0;
        userAccount.deposit(10000);
        userAccount.setPin(2222);
        userAccount.withdraw(5000,222);
        assertEquals(balance, userAccount.getBalance(), userAccount.getPin());

    }


}