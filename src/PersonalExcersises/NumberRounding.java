package PersonalExcersises;

public class NumberRounding {

    public static double roundToInteger(double numberToRoundOff) {
         return  (int)Math.floor(numberToRoundOff + 0.5);
    }

    public static double roundToTenths(double numberToRoundOff) {
        return (int) Math.floor(numberToRoundOff * 10 + 0.5)/10;
    }

    public static double roundToHundredths(double numberToRoundOff) {

        return (int) Math.floor(numberToRoundOff * 100 + 0.5)/100;
    }

    public static double roundToThousandths(double numberToRoundOff) {
        return (int) Math.floor(numberToRoundOff * 1000 + 0.5)/1000;
    }
}
