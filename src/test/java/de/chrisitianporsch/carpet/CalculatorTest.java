package de.chrisitianporsch.carpet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getTotalCost() {

        // Given

        Floor testFloor = new Floor(2.75, 4.0);
        Carpet testCarpet = new Carpet(3.5);

        Calculator calculator = new Calculator(testFloor, testCarpet);

        // When

        double expectedCosts = 38.5;
        double actualCosts = calculator.getTotalCost();

        // Then

        assertEquals(expectedCosts, actualCosts);


    }
}