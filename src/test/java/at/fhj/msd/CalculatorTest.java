/*
 * Konfiguration Try 4
 * unittests
 * Author: Gernot Schabkar
 * Last Change: 12.6.2024
 */
package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(9.0, Calculator.add(5.0, 4.0), "Adding 5.0 and 4.0 should be 9.0");
        assertEquals(1.0, Calculator.add(5.0, -4.0), "Adding 5.0 and -4.0 should be 1.0");
        assertEquals(-9.0, Calculator.add(-5.0, -4.0), "Adding -5.0 and -4.0 should be -9.0");
    }

    @Test
    public void testMinus() {
        assertEquals(1.0, Calculator.minus(5.0, 4.0), "Subtracting 4.0 from 5.0 should be 1.0");
        assertEquals(9.0, Calculator.minus(5.0, -4.0), "Subtracting -4.0 from 5.0 should be 9.0");
        assertEquals(-1.0, Calculator.minus(-5.0, -4.0), "Subtracting -4.0 from -5.0 should be -1.0");
    }

    @Test
    public void testDivide() {
        assertEquals(1.25, Calculator.divide(5.0, 4.0), "Dividing 5.0 by 4.0 should be 1.25");
        /*assertThrows(ArithmeticException.class, () ->
        {
            assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(5.0, 0), "Dividing 5.0 by 0 should be 0 + error");
        });*/
        assertEquals(-1.25, Calculator.divide(5.0, -4.0), "Dividing 5.0 by -4.0 should be -1.25");
        assertEquals(1.25, Calculator.divide(-5.0, -4.0), "Dividing -5.0 by -4.0 should be 1.25");
        // Test for division by zero
        try {
            // Main.divide(5.0, 0);
        } catch (
                ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage(), "Dividing by zero should throw ArithmeticException");
        }

    }

    @Test
    public void testMultiply() {
        assertEquals(20.0, Calculator.multiply(5.0, 4.0), "Multiplying 5.0 by 4.0 should be 20.0");
        assertEquals(-20.0, Calculator.multiply(5.0, -4.0), "Multiplying 5.0 by -4.0 should be -20.0");
        assertEquals(20.0, Calculator.multiply(-5.0, -4.0), "Multiplying -5.0 by -4.0 should be 20.0");
    }

    @Test
    public void testfactorial() {
        assertEquals(120, Calculator.factorial(5), "factor of 5 should be 120");
        assertEquals(24, Calculator.factorial(4), "factor of 4 should be 24");
        assertEquals(6, Calculator.factorial(3), "factor of 5 should be 6");
    }
}


