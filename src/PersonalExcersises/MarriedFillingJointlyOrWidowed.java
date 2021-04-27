package PersonalExcersises;

public class MarriedFillingJointlyOrWidowed {
    private double taxRate;
    private double taxToBePaid;

    public double tenPercentTaxRate(double amountEarned){
        if (amountEarned <= 16700 && amountEarned > 0.0){
            taxRate = 0.1;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    public double fifteenPercentTaxRate(double amountEarned){
        if (amountEarned <=67900 && amountEarned >= 16701){
            taxRate = 0.15;
            try{
                taxToBePaid = taxRate * amountEarned;}
            catch (Throwable e){
                System.out.println ("Input Correct Amount");
            }
            return taxToBePaid;}
        else
            return 0.0;
    }

    public double twenty_fivePercentTaxRate(double amountEarned){
        if (amountEarned <= 137050 && amountEarned >= 67901){
            taxRate = 0.25;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    public double twenty_eightPercentTaxRate(double amountEarned){
        if (amountEarned <= 208850 && amountEarned >= 137051){
            taxRate = 0.28;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    public double thirty_threePercentTaxRate(double amountEarned){
        if (amountEarned <= 372950 && amountEarned >= 208851){
            taxRate = 0.33;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    public double thirty_fivePercentTaxRate(double amountEarned){
        if (amountEarned >= 372951){
            taxRate = 0.35;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }
}
