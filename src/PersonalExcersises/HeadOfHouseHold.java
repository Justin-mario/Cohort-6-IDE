package PersonalExcersises;

public class HeadOfHouseHold extends FederalTaxRate implements PayableTaxRate{
    private double taxRate;
    private double taxToBePaid;

    @Override
    public double tenPercentTaxRate(double amountEarned){
        if (amountEarned <= 11950 && amountEarned > 0.0){
            taxRate = 0.1;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }
    @Override
    public double fifteenPercentTaxRate(double amountEarned){
        if (amountEarned <=45500 && amountEarned >= 11951){
            taxRate = 0.15;
                taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double twenty_fivePercentTaxRate(double amountEarned){
        if (amountEarned <= 117450 && amountEarned >= 45501){
            taxRate = 0.25;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double twenty_eightPercentTaxRate(double amountEarned){
        if (amountEarned <= 190200 && amountEarned >= 117451){
            taxRate = 0.28;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double thirty_threePercentTaxRate(double amountEarned){
        if (amountEarned <= 372950 && amountEarned >= 190201){
            taxRate = 0.33;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double thirty_fivePercentTaxRate(double amountEarned){
        if (amountEarned >= 372951){
            taxRate = 0.35;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }
}
