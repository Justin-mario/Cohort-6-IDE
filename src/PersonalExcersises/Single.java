package PersonalExcersises;

public class Single extends FederalTaxRate implements PayableTaxRate {
    private double taxRate;
    private double taxToBePaid;

    @Override
    public double tenPercentTaxRate(double amountEarned){
        if (amountEarned <= 8350 && amountEarned > 0.0){
        taxRate = 0.1;
        taxToBePaid = taxRate * amountEarned;
        return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double fifteenPercentTaxRate(double amountEarned){
        if (amountEarned <=33950 && amountEarned >= 8351){
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

    @Override
    public double twenty_fivePercentTaxRate(double amountEarned){
        if (amountEarned <= 82250 && amountEarned >= 33951){
        taxRate = 0.25;
        taxToBePaid = taxRate * amountEarned;
        return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double twenty_eightPercentTaxRate(double amountEarned){
        if (amountEarned <= 171550 && amountEarned >= 82251){
        taxRate = 0.28;
        taxToBePaid = taxRate * amountEarned;
        return taxToBePaid;}
        else
            return 0.0;
    }

    @Override
    public double thirty_threePercentTaxRate(double amountEarned){
        if (amountEarned <= 372950 && amountEarned >= 171551){
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
