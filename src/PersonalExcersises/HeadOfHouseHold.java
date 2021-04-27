package PersonalExcersises;

public class HeadOfHouseHold {
    private double taxRate;
    private double taxToBePaid;

    public double tenPercentTaxRate(double amountEarned){
        if (amountEarned <= 11950 && amountEarned > 0.0){
            taxRate = 0.1;
            taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }

    public double fifteenPercentTaxRate(double amountEarned){
        if (amountEarned <=45500 && amountEarned >= 11951){
            taxRate = 0.15;
                taxToBePaid = taxRate * amountEarned;
            return taxToBePaid;}
        else
            return 0.0;
    }
}
