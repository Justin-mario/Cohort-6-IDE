package PersonalExcersises;

import static PersonalExcersises.Status.*;

public class FederalTaxRate {
    private double taxPaid;
    private double taxRate;

    public double pay10PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        taxRate = 0.1;
        if (amountEarned <= 8351 && amountEarned > 0 && fillingStatus == SINGLE) {
            try {
                taxPaid = amountEarned * taxRate;
            } catch (Throwable e) {
                    System.out.print ( "You Cant Pay less Than 10% on Your Earnings" + e );
                }
            return taxPaid;
            } else
                return 0.0;
        }


    public double pay15PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        taxRate = 0.15;
        if (amountEarned <= 33950 && amountEarned >= 8350 && fillingStatus == SINGLE){
            taxPaid = amountEarned * taxRate;
            return taxPaid;}
        else
            return 0 ;

    }

    public double pay25PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        taxRate = 0.25;
        if(amountEarned <= 82250 && amountEarned >= 33951 && fillingStatus == SINGLE ){
            taxPaid = amountEarned * taxRate;
            return taxPaid;}
        else
            return 0;
    }

    public double pay28PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        taxRate = 0.28;
        if (amountEarned <= 171550 && amountEarned >= 82251 && fillingStatus == SINGLE ){
            taxPaid = amountEarned * taxRate;
            return taxPaid;}
        else
            return 0;
    }

    public double pay33PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        taxRate = 0.33;
        if (amountEarned <= 372950 && amountEarned >= 171551 && fillingStatus == SINGLE ){

            taxPaid = amountEarned * taxRate;
            return taxPaid;}
        else
            return 0;
    }

    public double pay35PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        if (amountEarned >= 372951 && fillingStatus == SINGLE ){
            taxRate = 0.35;
            taxPaid = amountEarned * taxRate;
            return taxPaid;}
        else
            return 0;
    }

    public double pay10PercentTaxRateForMarriedJointFillingOrWidow(double amountEarned, Status fillingStatus) {
        taxRate = 0.1;
        if (amountEarned <= 8351 && amountEarned > 0 && fillingStatus == MARRIEDJOINTFILLINGORWIDOW) {
                taxPaid = amountEarned * taxRate;

            return taxPaid; }
        else
            return 0;
    }
}



