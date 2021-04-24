package PersonalExcersises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static PersonalExcersises.Status.*;
import static org.junit.jupiter.api.Assertions.*;


public class FederalPersonalTaxRateSpec {
    @BeforeEach
    void before_each_test() {
        taxRate = new FederalTaxRate ();
    }

    FederalTaxRate taxRate;
    double taxPaid;

    @Test
    @DisplayName ( "Singles Can Pay Tax At 10% On Earnings below 8350" )
    void checkSinglesCanPay10PercentTax() {
        taxPaid = taxRate.pay10PercentTaxRate ( 8000, SINGLE);
        assertEquals ( 800, taxPaid );
        taxPaid = taxRate.pay10PercentTaxRate ( 8350,SINGLE );
        assertEquals ( 835, taxPaid );

    }

    @Test
    @DisplayName ( "Single Can not Input Negative Amount As Earning" )
    void checkSinglesCannotInputNegativeAmountAsEarning() {
        taxPaid = taxRate.pay10PercentTaxRate ( -10000, SINGLE );
        assertEquals ( 0, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can not Access A Wrong Tax Package" )
    void checkSinglesCannotAccessAWrongPackage() {
        taxPaid = taxRate.pay10PercentTaxRate ( 1000, HEADOFHOUSEHOLD );
        assertThrows ( Throwable.class, ()-> assertEquals ( 0, taxPaid)  );
    }

    @Test
    @DisplayName ( "Singles Can not Pay 10% Tax On Earning Above 8350 " )
    void checkSinglesCannotPay10PercentTaxOnEarningAbove_8350() {
        taxPaid = taxRate.pay10PercentTaxRate ( 9000,SINGLE );
        assertEquals ( 0, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 15% Tax On Earning Between 8351 and 33950 " )
    void checkSinglesCanPay15PercentTaxOnEarning() {
        taxPaid = taxRate.pay15PercentTaxRate ( 8351, SINGLE );
        assertEquals ( 1252.6499999999999, taxPaid );
        taxPaid = taxRate.pay15PercentTaxRate ( 33950, SINGLE );
        assertEquals ( 5092.5, taxPaid );
    }
    @DisplayName ( "Singles Can Not Pay less Than 10% on Earnings Between_8351_and_33950_forSingles " )
    @Test
    void checkSingleCannotPayLessThan15PercentTax() {
        taxPaid = taxRate.pay15PercentTaxRate ( 9000, SINGLE );
        assertThrows ( Throwable.class, ()-> assertEquals ( 1000, taxPaid)  );
    }

    @Test
    @DisplayName ( "Singles Can Pay 25% Tax On Earning Between 33951 and 82250" )
     void checkSinglesCanPay25PercentTax() {
        taxPaid = taxRate.pay25PercentTaxRateForSingles ( 33951, SINGLE );
        assertEquals ( 8487.75, taxPaid );
        taxPaid = taxRate.pay25PercentTaxRateForSingles ( 82250, SINGLE );
        assertEquals ( 20562.5, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 28% Tax On Earning Between 82251 and 171550" )
    void checkSinglesCanPay28PercentTax() {
        taxPaid = taxRate.pay28PercentTaxRateForSingles ( 82251, SINGLE );
        assertEquals ( 23030.280000000002, taxPaid );
        taxPaid = taxRate.pay28PercentTaxRateForSingles ( 171550, SINGLE );
        assertEquals ( 48034.00000000001, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 33% Tax On Earning Between 171551 and 372950" )
    void checkSinglesCanPay33PercentTaxOnEarning() {
        taxPaid = taxRate.pay33PercentTaxRateForSingles ( 171551, SINGLE );
        assertEquals ( 56611.83, taxPaid );
        taxPaid = taxRate.pay33PercentTaxRateForSingles ( 372950, SINGLE );
        assertEquals ( 123073.5, taxPaid );
    }

    @Test
    @DisplayName ( "Singles Can Pay 35% Tax On Earning from 372951 and Above" )
    void checkSinglesCanPay35PercentTaxOnEarning() {
        taxPaid = taxRate.pay35PercentTaxRateForSingles ( 372951, SINGLE );
        assertEquals ( 130532.84999999999, taxPaid );
        taxPaid = taxRate.pay35PercentTaxRateForSingles ( 4000000, SINGLE );
        assertEquals ( 1400000.0, taxPaid );
    }

    @Test
    @DisplayName ( "Widow And Married couples Can Jointly Pay Marginal Tax At 10% " )
    void checkMarriedCoupleOrWidowCanPayOnEarnings_below_16700() {
        taxPaid = taxRate.pay10PercentTaxRate ( 4500, MARRIEDJOINTFILLINGORWIDOW);
        assertEquals ( 450, taxPaid );
        taxPaid = taxRate.pay10PercentTaxRate ( 16700,MARRIEDJOINTFILLINGORWIDOW );
        assertEquals ( 1670, taxPaid );
    }

    @Test
    @DisplayName ( "Married But Filling Separately Can Pay Marginal Tax At 10% " )
    void checkMarriedButFillingSeparatelyCanPayOnEarnings_below_8350() {
        taxPaid = taxRate.pay10PercentTaxRate ( 4500, MARRIEDFILLINGSEPARATELY);
        assertEquals ( 450, taxPaid );
        taxPaid = taxRate.pay10PercentTaxRate ( 8350,MARRIEDFILLINGSEPARATELY );
        assertEquals ( 835, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of HouseHold Can Pay Marginal Tax At 10% " )
    void checkHeadOfHouseholdCanPayOnEarnings_below_11950() {
        taxPaid = taxRate.pay10PercentTaxRate ( 4500, HEADOFHOUSEHOLD);
        assertEquals ( 450, taxPaid );
        taxPaid = taxRate.pay10PercentTaxRate ( 11950,HEADOFHOUSEHOLD );
        assertEquals ( 1195, taxPaid );
    }

    @Test
    @DisplayName ( "Widow And Married couples Can Jointly Pay Marginal Tax At 15% On Earnings Between 16,701 and 67,900" )
    void checkMarriedCoupleOrWidowCanPayTaxOnEarnings() {
        taxPaid = taxRate.pay15PercentTaxRate ( 16701, MARRIEDJOINTFILLINGORWIDOW);
        assertEquals ( 2505.15, taxPaid );
        taxPaid = taxRate.pay15PercentTaxRate ( 67900,MARRIEDJOINTFILLINGORWIDOW );
        assertEquals ( 10185.0, taxPaid );
    }

    @Test
    @DisplayName ( "Married But Filling Separately Can Pay Marginal Tax At 15% On Earnings Between 8351 and 33950" )
    void checkMarriedButFillingSeparatelyCanPayOnEarnings() {
        taxPaid = taxRate.pay15PercentTaxRate ( 8351, MARRIEDFILLINGSEPARATELY);
        assertEquals ( 1252.6499999999999, taxPaid );
        taxPaid = taxRate.pay15PercentTaxRate ( 33950,MARRIEDFILLINGSEPARATELY );
        assertEquals ( 5092.5, taxPaid );
    }

    @Test
    @DisplayName ( "Head Of HouseHold Can Pay Marginal Tax At 15% on Earnings Between 11951 and 45500 " )
    void checkHeadOfHouseholdCanPayOnEarnings() {
        taxPaid = taxRate.pay15PercentTaxRate ( 11951, HEADOFHOUSEHOLD);
        assertEquals ( 1792.6499999999999, taxPaid );
        taxPaid = taxRate.pay15PercentTaxRate ( 45500,HEADOFHOUSEHOLD );
        assertEquals ( 6825, taxPaid );
    }
}