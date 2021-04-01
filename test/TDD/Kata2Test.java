package TDD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata2Test {

    @Test
    @DisplayName ( "Get Maximum Number of An Array" )
        void checkForMaximumNumberOfArray(){
        int[] arrays = {1, 2, 3, 0};

        int maximum = Kata2.getMaximum(arrays);
        assertEquals ( 3,maximum);

    }

    @Test
    @DisplayName ( "Get Minimum Number Of An Array Object" )
        void checkForMinimumNumberOfAnArray(){
        int[] arrays = {20,25,15,0};

        int minimum = Kata2.getMinimum(arrays);
        assertEquals ( 0, minimum );
    }

    @Test
    @DisplayName ( "Get Sum Of An Array Object" )
        void checkForSumOfAnArray(){
        int[] arrays = {20,25,15};

        int sum = Kata2.getSum(arrays);
        assertEquals ( arrays[0]+arrays[1]+arrays[2], sum);
    }

    @Test
    @DisplayName ( "Get Average Of An Array Objects" )
        void checkForAverageOfAnArray(){
        int[] arrays = {20,25,15};
        int average = Kata2.getAverage(arrays);
        assertEquals ( (20+25+15)/3, average );
    }
}