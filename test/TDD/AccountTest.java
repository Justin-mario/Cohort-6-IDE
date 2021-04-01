package TDD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
@Test
    void account_canBeDepositedInto(){
        //given
    Account myAccount = new Account();
    //when
    myAccount.depositMoney(2500);
    //given
    double balance = myAccount.getAccountBalance();
    assertEquals(2500,balance);
}
@Test
@DisplayName(" Receive another Deposit")
    void accountCanReceiveDoubleDeposit() {
    Account newAccount = new Account();
    newAccount.depositMoney(2000);

    newAccount.depositMoney(3500);
    assertEquals(5500, newAccount.getAccountBalance());
}

    @Test
            void accountCannotReceiveNegativeValue(){
            Account nowAccount = new Account();

            nowAccount.depositMoney(-10);

            assertEquals(0, nowAccount.getAccountBalance());
    }

    @Test
        void moneyCanBeWithdrawn(){
        Account withdraw = new Account();

        withdraw.depositMoney(7000);
        withdraw.setPin(1970);


        withdraw.withDrawMoney(2000, 1970);

        assertTrue(withdraw.getAccountBalance() == 5000);
    }
}
