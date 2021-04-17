package PersonalExcersises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class RoundingNumbersSpec {
    @Test
    void canRoundToInteger(){
        double roundedNumber = NumberRounding.roundToInteger(10.5);
        assertSame (11,(int)roundedNumber);
    }

    @Test
    void canRoundToTenths(){
        double roundedNumber = NumberRounding.roundToTenths(95.5);
        assertSame (95,(int)roundedNumber);
    }

    @Test
    void canRoundToHundredths(){
        double roundedNumber = NumberRounding.roundToHundredths(987.98);
        assertEquals (987,(int)roundedNumber);
    }

    @Test
    void canRoundToThousandths(){
        double roundedNumber = NumberRounding.roundToThousandths(4782.45);
        assertEquals (4782,(int)roundedNumber);
    }
}
