package org.types;

import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        /*
         * In many applications, numeric values need to be displayed
         * in a user-friendly format.
         *
         * Common examples include:
         * - Formatting numbers as currency (e.g., $1,234,567.89)
         * - Formatting decimal values as percentages (e.g., 0.25 → 25%)
         *
         * Java provides the NumberFormat class (java.text package)
         * to handle these formatting requirements.
         */

        /*
         * NumberFormat is an abstract class, so it cannot be instantiated
         * using the 'new' keyword.
         *
         * Instead, factory methods such as getCurrencyInstance()
         * are used to obtain a concrete implementation.
         */
        NumberFormat currency=NumberFormat.getCurrencyInstance();

        /*
         * The format() method converts a numeric value into a
         * locale-specific currency string.
         *
         * - Adds the currency symbol
         * - Groups digits with commas
         * - Limits decimal places (usually to two)
         */
        String resultMoney=currency.format(1234567.891);
        System.out.println(resultMoney);//output: $1,234,567.89

        /*
         * To format numbers as percentages, NumberFormat provides
         * the getPercentInstance() factory method.
         *
         * The input value is multiplied by 100 and suffixed with '%'.
         */
        NumberFormat percent=NumberFormat.getPercentInstance();
        String resultPercentage=percent.format(0.25);
        System.out.println(resultPercentage);// output: 25%

        /*
         * When an object is used only once, it is not necessary
         * to store it in a separate variable.
         *
         * The returned NumberFormat object can be used immediately.
         * This technique is known as method chaining.
         */
        String resultProper=NumberFormat.getPercentInstance().format(0.456);
        System.out.println(resultProper); // Output: 46%
    }
}
