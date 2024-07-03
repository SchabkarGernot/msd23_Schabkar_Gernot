/*
 * Konfiguration Try 4
 * unittests
 * Author: Gernot Schabkar
 * Last Change: 12.6.2024
 */

package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is a CalculatorClass implementing basic functionality.
 */

public class Calculator {

    /**
     * Returns the sum of 2 numbers
     *
     * @param  number1  the first number
     * @param  number2  the second number
     * @return  the sum of  number1 and number2
     *
     */
    public static double add(double number1, double number2) {

        logger.debug("Function add, params: " + number1 + " and " + number2);
        return number1 + number2;
    }
    /**
     * Returns number1 - number2
     *
     * @param  number1  the first number
     * @param  number2  the second number
     * @return      the difference of number1 and number2
     *
     */
    public static double minus(double number1, double number2) {
        logger.debug("Function minus, params: " + number1 + " and " + number2);
        return number1 - number2;
    }
    /**
     * Returns the sum of 2 numbers
     *
     * @param  number1  the first number
     * @param  number2  the second number
     * @throws    ArithmeticException if number2 is zero
     * @return      the division of  number1 and number2
     *
     */
    public static double divide(double number1, double number2) {
        logger.debug("Function divide, params: " + number1 + " and " + number2);
        try {
            if (number2 == 0) {
                logger.error("Function divide1, parameter2 = 0 !");
                throw new ArithmeticException("Division by 0");
            }
            return number1 / number2;
        } catch (Exception ArithmeticException) {
            logger.error("Function divide2, parameter2 = 0 !");
        }
        return 0;
    }
    /**
     * Returns the product of 2 numbers
     *
     * @param  number1  the first number
     * @param  number2  the second number
     * @return      the product of  number1 * number2
     *
     */
    public static double multiply(double number1, double number2) {
        logger.debug("Function multiply, params: " + number1 + " and " + number2);
        return number1 * number2;
    }
    /**
     * Returns the factor of a number
     * Recursivly called
     *
     * @param  n  the first number
     * @return      the product of  n!
     *
     */
    public static int factorial(int n) {
        logger.debug("Function factorial, params: " + n);
        //return 0;
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    /**
     *
     * Calculator , the call of this function returns one of each function-results
     *
     */
    Calculator() {
        System.out.println("5-4:" + minus(5, 4));
        System.out.println("5+4:" + add(5, 4));
        System.out.println("5/4:" + divide(5, 0));
        System.out.println("5*4:" + multiply(5, 4));
        System.out.println("Factor of 5:" + factorial(5));
    }

    private static Logger logger = LogManager.getLogger();

}
