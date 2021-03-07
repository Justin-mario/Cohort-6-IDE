package TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata1Test2 {
    Kata1 buyer = new Kata1();

@Test
    @DisplayName("Check for 1 to 4 copies")
    void buy1To4Copies(){
    assertEquals(6000, buyer.calculatePriceFor(4));
    assertEquals(1500, buyer.calculatePriceFor(1));
}
@Test
    @DisplayName(" Check for 5 to 9 copies")
        void buy5To9Copies(){
    assertEquals(1400 * 5, buyer.calculatePriceFor(5));
    assertEquals(1400 * 9, buyer.calculatePriceFor(9));
    assertEquals(1400 * 7, buyer.calculatePriceFor(7));
}

@Test
    @DisplayName("check for 10 to 29 copies")
    void buy10To29Copies(){
    assertEquals(10 * 1200, buyer.calculatePriceFor(10));
    assertEquals(29 * 1200, buyer.calculatePriceFor(29));
    assertEquals(15 * 1200, buyer.calculatePriceFor(15));
}
@Test
    @DisplayName("check for 30 to 49 copies")
    void buy30To49Copies(){
    assertEquals(1100 * 30, buyer.calculatePriceFor(30));
    assertEquals(1100 * 49, buyer.calculatePriceFor(49));
    assertEquals(1100 * 39, buyer.calculatePriceFor(39));
}
@Test
    @DisplayName("check for 50 to 99 copies")
    void buy50To99Copies(){
    assertEquals(50 * 1000, buyer.calculatePriceFor(50));
    assertEquals(99 * 1000, buyer.calculatePriceFor(99));
    assertEquals(78 * 1000, buyer.calculatePriceFor(78));
}
@Test
    @DisplayName(" check for 100 to 199 copies")
        void buy100To199Copies(){
    assertEquals(100 * 900, buyer.calculatePriceFor(100));
    assertEquals(199 * 900, buyer.calculatePriceFor(199));
    assertEquals(179 * 900, buyer.calculatePriceFor(179));
}
@Test
    @DisplayName(" check for 2oo copies and above")
        void buy200CopiesAndAbove(){
    assertEquals(200 * 800, buyer.calculatePriceFor(200));
    assertEquals(500 * 800, buyer.calculatePriceFor(500));
    assertEquals(299 * 800, buyer.calculatePriceFor(299));
}
}