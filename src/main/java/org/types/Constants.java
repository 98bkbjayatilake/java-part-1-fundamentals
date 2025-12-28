package org.types;

public class Constants {
    public static void main(String[] args) {
        /*
         * So far, you have learned about variables.
         * When declaring variables, we initialize them and we can change
         * their values throughout the lifetime of the program.
         *
         * However, there are situations where we do NOT want a value to change.
         * For example, consider the value of Pi (π).
         *
         * By default, Java treats all decimal (floating-point) literals as double.
         * To store the value in a float variable, we must append the letter 'F'
         * to the numeric literal.
         */
        final float PI = 3.14F;

        /*
         * The value of Pi is commonly used to calculate the area of a circle.
         * Imagine that before performing the calculation, someone accidentally
         * changes the value of Pi.
         *
         * This would lead to incorrect results throughout the application.
         */

        // PI = 1;  //  Compilation error: cannot assign a value to final variable

        /*
         * To prevent such issues, we declare constants using the 'final' keyword.
         * Once a variable is declared as final and initialized, its value
         * cannot be changed.
         *
         * This ensures data integrity and makes the code safer and more reliable.
         *
         * By convention, constants are named using uppercase letters,
         * with words separated by underscores if necessary.
         */
    }
}
