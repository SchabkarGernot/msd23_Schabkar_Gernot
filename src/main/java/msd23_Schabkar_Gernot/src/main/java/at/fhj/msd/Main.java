/*
 * Konfiguration Try 4
 * unittests
 * Author: Gernot Schabkar
 * Last Change: 12.6.2024
 */

package msd23_Schabkar_Gernot.src.main.java.at.fhj.msd;

public class Main {
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static int factorial(int n) {
        return 0;
        //if (n<=1) return 1;
        //return n*factorial(n-1);
    }
    Main() {
        System.out.println("5-4:" + minus(5,4));
        System.out.println("5+4:" + add(5,4));
        System.out.println("5/4:" + divide(5,4));
        System.out.println("5*4:" + multiply(5,4));
        System.out.println( "Factor of 5:" + factorial(5));
    }


    public static void main(String[] args) {
        Main calc = new Main();
        System.out.println("Gernot Schabkar");


    }
}
