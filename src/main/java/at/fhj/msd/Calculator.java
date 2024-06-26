/*
 * Konfiguration Try 4
 * unittests
 * Author: Gernot Schabkar
 * Last Change: 12.6.2024
 */

package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    public static double add(double number1, double number2) {

        logger.debug("Function add, params: " + number1 + " and " + number2);
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        logger.debug("Function minus, params: " + number1 + " and " + number2);
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        logger.debug("Function divide, params: " + number1 + " and " + number2);
        try {
            if (number2 == 0) logger.error("Function divide1, parameter2 = 0 !");
            return number1 / number2;
        } catch (Exception ArithmeticException) {
            logger.error("Function divide2, parameter2 = 0 !");
        }
        return 0;
    }

    public static double multiply(double number1, double number2) {
        logger.debug("Function multiply, params: " + number1 + " and " + number2);
        return number1 * number2;
    }

    public static int factorial(int n) {
        logger.debug("Function factorial, params: " + n);
        //return 0;
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    Calculator() {
        System.out.println("5-4:" + minus(5, 4));
        System.out.println("5+4:" + add(5, 4));
        System.out.println("5/4:" + divide(5, 0));
        System.out.println("5*4:" + multiply(5, 4));
        System.out.println("Factor of 5:" + factorial(5));
    }

    private static Logger logger = LogManager.getLogger();

}
