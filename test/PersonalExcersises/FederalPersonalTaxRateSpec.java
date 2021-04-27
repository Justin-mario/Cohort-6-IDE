package PersonalExcersises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class FederalPersonalTaxRateSpec {
    @BeforeEach
    void before_each_test() {

        singleTaxRate = new Single ();
        marriedFillingJointlyTaxRate = new MarriedFillingJointlyOrWidowed();
        marriedFillingTaxSeparately = new MarriedFillingSeparately ();
        headOfHouseHoldTax = new HeadOfHouseHold();
    }

    Single singleTaxRate;
    MarriedFillingJointlyOrWidowed marriedFillingJointlyTaxRate;
    MarriedFillingSeparately marriedFillingTaxSeparately;
    HeadOfHouseHold headOfHouseHoldTax;
    double taxPaid;

    @Test
    @DisplayName ( "Singles Can Pay Tax At 10% On Earnings below 8350" )
    void checkSinglesCanPay10PercentTaxOnEarning() {
        taxPaid = singleTaxRate.tenPercentTaxRate ( 8000);
        assertEquals ( 800, taxPaid );
        taxPaid = singleTaxRate.tenPercentTaxRate ( 8350);
        assertEquals ( 835, taxPaid );
    }

    @Test
    @DisplayName ( "Single Can not Input Negative Amount As Earning" )
    void checkSinglesCannotInputNegativeAmountAsEarning() {
        taxPaid = singleTaxRate.tenPercentTaxRate ( -10000 );
        assertEquals ( 0, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can not Pay 10% Tax On Earning Above 8350 " )
    void checkSinglesCannotPay10PercentTaxOnEarningAbove_8350() {
        taxPaid = singleTaxRate.tenPercentTaxRate ( 9000);
        assertEquals ( 0, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 15% Tax On Earning Between 8351 and 33950 " )
    void checkSinglesCanPay15PercentTaxOnEarning() {
        taxPaid = singleTaxRate.fifteenPercentTaxRate ( 8351 );
        assertEquals ( 1252.6499999999999, taxPaid );
        taxPaid = singleTaxRate.fifteenPercentTaxRate ( 33950);
        assertEquals ( 5092.5, taxPaid );
    }


    @DisplayName ( "Singles Can Not Pay less Than 10% on Earnings Between_8351_and_33950_forSingles " )
    @Test
    void checkSingleCannotPayLessThan15PercentTax() {
        taxPaid = singleTaxRate.fifteenPercentTaxRate ( 9000 );
        assertThrows ( Throwable.class, ()-> assertEquals ( 1000, taxPaid)  );
    }

    @Test
    @DisplayName ( "Singles Can Pay 25% Tax On Earning Between 33951 and 82250" )
     void checkSinglesCanPay25PercentTax() {
        taxPaid = singleTaxRate.twenty_fivePercentTaxRate ( 33951 );
        assertEquals ( 8487.75, taxPaid );
        taxPaid = singleTaxRate.twenty_fivePercentTaxRate ( 82250 );
        assertEquals ( 20562.5, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 28% Tax On Earning Between 82251 and 171550" )
    void checkSinglesCanPay28PercentTax() {
        taxPaid = singleTaxRate.twenty_eightPercentTaxRate ( 82251 );
        assertEquals ( 23030.280000000002, taxPaid );
        taxPaid = singleTaxRate.twenty_eightPercentTaxRate ( 171550 );
        assertEquals ( 48034.00000000001, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 33% Tax On Earning Between 171551 and 372950" )
    void checkSinglesCanPay33PercentTaxOnEarning() {
        taxPaid = singleTaxRate.thirty_threePercentTaxRate ( 171551);
        assertEquals ( 56611.83, taxPaid );
        taxPaid = singleTaxRate.thirty_threePercentTaxRate ( 372950 );
        assertEquals ( 123073.5, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 35% Tax On Earning from 372951 and Above" )
    void checkSinglesCanPay35PercentTaxOnEarning() {
        taxPaid = singleTaxRate.thirty_fivePercentTaxRate ( 372951 );
        assertEquals ( 130532.84999999999, taxPaid );
        taxPaid = singleTaxRate.thirty_fivePercentTaxRate ( 4000000);
        assertEquals ( 1400000.0, taxPaid );
    }

    @Test
    @DisplayName ( "Widow Or Married couples Can Jointly Pay Tax At 10% Rate On Earnings Below 16,700 " )
    void checkMarriedCoupleOrWidowCanPayTax() {
        taxPaid = marriedFillingJointlyTaxRate.tenPercentTaxRate ( 4500);
        assertEquals ( 450, taxPaid );
        taxPaid = marriedFillingJointlyTaxRate.tenPercentTaxRate ( 16700 );
        assertEquals ( 1670, taxPaid );
    }

    @Test
    @DisplayName ( "Widow Or Married couples Can Jointly Pay Tax At 15% On Earnings Between 16,701 and 67,900 " )
    void checkMarriedCoupleOrWidowCanPayOnEarnings() {
        taxPaid = marriedFillingJointlyTaxRate.fifteenPercentTaxRate ( 16701);
        assertEquals ( 2505.15, taxPaid );
        taxPaid = marriedFillingJointlyTaxRate.fifteenPercentTaxRate ( 67900 );
        assertEquals ( 10185.0, taxPaid );
    }

    @Test
    @DisplayName ( "Widow Or Married couples Can Jointly Pay Tax At 25% On Earnings Between 67,901 and 137,050" )
    void checkMarriedCoupleOrWidowCanPay25PercentTaxOnEarnings() {
        taxPaid = marriedFillingJointlyTaxRate.twenty_fivePercentTaxRate ( 67901);
        assertEquals ( 16975.25, taxPaid );
        taxPaid = marriedFillingJointlyTaxRate.twenty_fivePercentTaxRate ( 137050 );
        assertEquals ( 34262.5, taxPaid );
    }

    @Test
    @DisplayName ( "Widow Or Married couples Can Jointly Pay Marginal Tax At 28% On Earnings Between 137,051 and 208,850" )
    void checkMarriedCoupleOrWidowCanPay28PercentTaxOnEarnings() {
        taxPaid = marriedFillingJointlyTaxRate.twenty_eightPercentTaxRate ( 137051);
        assertEquals ( 38374.280000000006, taxPaid );
        taxPaid = marriedFillingJointlyTaxRate.twenty_eightPercentTaxRate ( 208850 );
        assertEquals ( 58478.00000000001, taxPaid );
    }

    @Test
    @DisplayName ( "Widow Or Married couples Can Jointly Pay Marginal Tax At 33% On Earnings Between 208,851 and 372,950" )
    void checkMarriedCoupleOrWidowCanPay33PercentTaxOnEarnings () {
        taxPaid = marriedFillingJointlyTaxRate.thirty_threePercentTaxRate ( 208851);
        assertEquals ( 68920.83, taxPaid );
        taxPaid = marriedFillingJointlyTaxRate.thirty_threePercentTaxRate ( 372950 );
        assertEquals ( 123073.5, taxPaid );
    }

    @Test
    @DisplayName ( "Widow Or Married couples Can Jointly Pay Marginal Tax At 35% On Earnings From 372,951 And Above " )
    void checkMarriedCoupleOrWidowCanPay35PercentTaxOnEarnings() {
        taxPaid = marriedFillingJointlyTaxRate.thirty_fivePercentTaxRate ( 372951);
        assertEquals ( 130532.84999999999, taxPaid );
        taxPaid = marriedFillingJointlyTaxRate.thirty_fivePercentTaxRate ( 500000 );
        assertEquals ( 175000, taxPaid );
    }

    @Test
    @DisplayName ( "Married but filling separately Can Pay Tax At 10% On Earnings below 8,350" )
    void checkMarriedButFillingSeparatelyCanPay10PercentTaxOnEarning() {
        taxPaid = marriedFillingTaxSeparately.tenPercentTaxRate ( 8000);
        assertEquals ( 800, taxPaid );
        taxPaid = marriedFillingTaxSeparately.tenPercentTaxRate ( 8350);
        assertEquals ( 835, taxPaid );
    }

    @Test
    @DisplayName ( "Married but Filling Separately Can Pay 15% Tax On Earning Between 8351 and 33950 " )
    void checkMarriedButFillingSeparatelyCanPay15PercentTaxOnEarning() {
        taxPaid = marriedFillingTaxSeparately.fifteenPercentTaxRate ( 8351 );
        assertEquals ( 1252.6499999999999, taxPaid );
        taxPaid = marriedFillingTaxSeparately.fifteenPercentTaxRate ( 33950);
        assertEquals ( 5092.5, taxPaid );
    }

    @Test
    @DisplayName ( "Married But Filling Separately Can Pay 25% Tax On Earning Between 33951 and 68525" )
    void checkMarriedButFilledSeparatelyCanPay25PercentTax() {
        taxPaid = marriedFillingTaxSeparately.twenty_fivePercentTaxRate ( 33951 );
        assertEquals ( 8487.75, taxPaid );
        taxPaid = marriedFillingTaxSeparately.twenty_fivePercentTaxRate ( 68525 );
        assertEquals ( 17131.25, taxPaid );
    }

    @Test
    @DisplayName ( "Married But Filling Separately Can Pay 28% Tax On Earning Between 68,526 and 104,425 " )
    void checkMarriedButFillingSeparatelyCanPay28PercentTax() {
        taxPaid = marriedFillingTaxSeparately.twenty_eightPercentTaxRate ( 68526 );
        assertEquals ( 19187.280000000002, taxPaid );
        taxPaid = marriedFillingTaxSeparately.twenty_eightPercentTaxRate ( 104425 );
        assertEquals ( 29239.000000000004, taxPaid );
    }

    @Test
    @DisplayName ( "Married But Filling Separately Can Pay 33% Tax On Earning Between 104426 and 186475 " )
    void checkMarriedButFillingSeparatelyCanPay33PercentTaxOnEarning() {
        taxPaid = marriedFillingTaxSeparately.thirty_threePercentTaxRate ( 104426);
        assertEquals ( 34460.58, taxPaid );
        taxPaid = marriedFillingTaxSeparately.thirty_threePercentTaxRate ( 186475 );
        assertEquals ( 61536.75, taxPaid );
    }

    @Test
    @DisplayName ( "Married But Filling Separately Can Pay 35% Tax On Earning from 186,476 and Above" )
    void checkMarriedButFillingSeparatelyCanPay35PercentTaxOnEarning() {
        taxPaid = marriedFillingTaxSeparately.thirty_fivePercentTaxRate ( 372951 );
        assertEquals ( 130532.84999999999, taxPaid );
        taxPaid = marriedFillingTaxSeparately.thirty_fivePercentTaxRate ( 186476);
        assertEquals ( 65266.6, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of House Hold Can Pay Tax At 10% On Earnings below 11,950" )
    void checkHeadOfHouseHoldCanPay10PercentTaxOnEarning() {
        HeadOfHouseHold headOfHouseHoldTax = new HeadOfHouseHold();
        taxPaid = headOfHouseHoldTax.tenPercentTaxRate ( 11950);
        assertEquals ( 1195, taxPaid );
        taxPaid = headOfHouseHoldTax.tenPercentTaxRate ( 8350);
        assertEquals ( 835, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of House Hold Can Pay Tax At 15% On Earnings between 11,951 and 45,500" )
    void checkHeadOfHouseHoldCanPay15PercentTaxOnEarning() {
        taxPaid = headOfHouseHoldTax.fifteenPercentTaxRate ( 11951);
        assertEquals ( 1792.6499999999999, taxPaid );
        taxPaid = headOfHouseHoldTax.fifteenPercentTaxRate ( 45500);
        assertEquals ( 6825, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of House Hold Can Pay Tax At 25% On Earnings between 45,501 and 117,450" )
    void checkHeadOfHouseHoldCanPay25PercentTaxOnEarning() {
        taxPaid = headOfHouseHoldTax.twenty_fivePercentTaxRate ( 45501);
        assertEquals ( 11375.25, taxPaid );
        taxPaid = headOfHouseHoldTax.twenty_fivePercentTaxRate ( 117450);
        assertEquals ( 29362.5, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of House Hold Can Pay Tax At 28% On Earnings between 117,451 and 190,200" )
    void checkHeadOfHouseHoldCanPay28PercentTaxOnEarning() {
        taxPaid = headOfHouseHoldTax.twenty_eightPercentTaxRate ( 117451);
        assertEquals ( 32886.280000000006, taxPaid );
        taxPaid = headOfHouseHoldTax.twenty_eightPercentTaxRate ( 190200);
        assertEquals ( 53256.00000000001, taxPaid );
    }


    @Test
    @DisplayName ( "Head Of House Hold Can Pay Tax At 33% On Earnings between 190,201 and 372,950" )
    void checkHeadOfHouseHoldCanPay33PercentTaxOnEarning() {
        taxPaid = headOfHouseHoldTax.thirty_threePercentTaxRate ( 190201);
        assertEquals ( 62766.33, taxPaid );
        taxPaid = headOfHouseHoldTax.thirty_threePercentTaxRate ( 372950);
        assertEquals ( 123073.5, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of House Hold Can Pay Tax At 35% On Earnings from 372,951" )
    void checkHeadOfHouseHoldCanPay35PercentTaxOnEarning() {
        taxPaid = headOfHouseHoldTax.thirty_fivePercentTaxRate ( 372951);
        assertEquals ( 130532.84999999999, taxPaid );
        taxPaid = headOfHouseHoldTax.thirty_fivePercentTaxRate ( 380000);
        assertEquals ( 133000, taxPaid );
    }
}