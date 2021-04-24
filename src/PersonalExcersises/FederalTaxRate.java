package PersonalExcersises;

import static PersonalExcersises.Status.*;

public class FederalTaxRate {
    private double taxPaid;
    private double taxRate;

    public double pay10PercentTaxRate(double amountEarned, Status fillingStatus) {
        taxRate = 0.1;
        switch (fillingStatus) {
            case SINGLE: {
                if (amountEarned <= 8350 && amountEarned > 0 && fillingStatus == SINGLE) {
                    try {
                        taxPaid = amountEarned * taxRate;
                        return taxPaid;
                    } catch (Throwable e) {
                        System.out.print ( "You Cant Pay less Than 10% on Your Earnings" + e );
                    }
                }
                else
                    return 0.0;
            }
            case MARRIEDJOINTFILLINGORWIDOW: {
                if (amountEarned <= 16700 && amountEarned > 0 && fillingStatus == MARRIEDJOINTFILLINGORWIDOW) {
                    taxPaid = amountEarned * taxRate;
                    return taxPaid;
                }
                else
                    return 0.0;
            }
            case MARRIEDFILLINGSEPARATELY: {
                if (amountEarned <= 8350 && amountEarned > 0 && fillingStatus == MARRIEDFILLINGSEPARATELY) {
                    taxPaid = amountEarned * taxRate;
                    return taxPaid;
                }
                else
                    return 0.0;
            }
            case HEADOFHOUSEHOLD: {
                if (amountEarned <= 11950 && amountEarned > 0 && fillingStatus == HEADOFHOUSEHOLD) {
                    taxPaid = amountEarned * taxRate;
                    return taxPaid;
                }
                else
                    return 0.0;
            }

            default:
                throw new IllegalStateException ( "Unexpected value: " + fillingStatus + amountEarned );
        }

    }



    public double pay15PercentTaxRate(double amountEarned, Status fillingStatus){
        taxRate = 0.15;
        switch (fillingStatus) {
            case SINGLE: {
                if (amountEarned <= 33950 && amountEarned >= 8351 && fillingStatus == SINGLE) {
                    try {
                        taxPaid = amountEarned * taxRate;
                        return taxPaid;
                    } catch (Throwable e) {
                        System.out.printf ( "You can not pay less than 15 percent"  + e);
                    }
                }
                else
                    return 0.0;

            }
            case MARRIEDJOINTFILLINGORWIDOW: {
                    if (amountEarned <= 67900 && amountEarned >= 16701 && fillingStatus == MARRIEDJOINTFILLINGORWIDOW) {
                            taxPaid = amountEarned * taxRate;
                            return taxPaid;}
                    else
                        return 0.0; }
            case MARRIEDFILLINGSEPARATELY:{
                if (amountEarned <= 33950 && amountEarned >= 8351 && fillingStatus == MARRIEDFILLINGSEPARATELY) {
                    taxPaid = amountEarned * taxRate;
                    return taxPaid;}
                else
                    return 0.0;
            }
            case HEADOFHOUSEHOLD: {
                if (amountEarned <= 45500 && amountEarned >= 11951 && fillingStatus == HEADOFHOUSEHOLD) {
                    taxPaid = amountEarned * taxRate;
                    return taxPaid;}
                else
                    return 0.0;
            }
        }
        return taxPaid;
    }

        public double pay25PercentTaxRateForSingles ( double amountEarned, Status fillingStatus){
            taxRate = 0.25;
            if (amountEarned <= 82250 && amountEarned >= 33951 && fillingStatus == SINGLE) {
                taxPaid = amountEarned * taxRate;
                return taxPaid;
            } else
                return 0;
        }

        public double pay28PercentTaxRateForSingles ( double amountEarned, Status fillingStatus){
            taxRate = 0.28;
            if (amountEarned <= 171550 && amountEarned >= 82251 && fillingStatus == SINGLE) {
                taxPaid = amountEarned * taxRate;
                return taxPaid;
            } else
                return 0;
        }

        public double pay33PercentTaxRateForSingles ( double amountEarned, Status fillingStatus){
            taxRate = 0.33;
            if (amountEarned <= 372950 && amountEarned >= 171551 && fillingStatus == SINGLE) {

                taxPaid = amountEarned * taxRate;
                return taxPaid;
            } else
                return 0;
        }

        public double pay35PercentTaxRateForSingles ( double amountEarned, Status fillingStatus){
            if (amountEarned >= 372951 && fillingStatus == SINGLE) {
                taxRate = 0.35;
                taxPaid = amountEarned * taxRate;
                return taxPaid;
            } else
                return 0;
        }


        public double pay10PercentTaxRateForMarriedJointFillingOrWidow ( double amountEarned, Status fillingStatus){
            return taxPaid;
        }

    public double pay10PercentTaxRateForSingles(double amountEarned, Status fillingStatus) {
        return taxPaid;
    }
}


