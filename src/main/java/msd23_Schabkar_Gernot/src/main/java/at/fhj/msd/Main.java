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
    Main() {
        System.out.println("5-4:" + minus(5,4));
        System.out.println("5+4:" + add(5,4));
        System.out.println("5/4:" + divide(5,4));
        System.out.println("5*4:" + multiply(5,4));
    }

    public static void main(String[] args) {
        Main calc = new Main();
        System.out.println("Gernot Schabkar");


    }
}
