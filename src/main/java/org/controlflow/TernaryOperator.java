package org.controlflow;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
         * This example demonstrates the use of the ternary operator,
         * which provides a concise way to assign a value based on a condition.
         */

        /*
         * Scenario:
         * Assume the income represents a customer's annual income.
         * Based on this value, customers should be categorized into classes:
         * - If income is greater than 100,000 → "First"
         * - Otherwise → "Economy"
         */

        /*
        * One possible approach is to use an if statement:
        *
        * int income = 120_000 ;
        * String className= "Economy";
        * if (income > 100_000)
        *    className="First";
        *
        * While this solution is correct, it can be simplified.
        */

        /*
         * A direct assignment such as:
         *     String className = (income > 100_000);
         * is not valid because the expression (income > 100_000)
         * evaluates to a boolean, while className is of type String.
         *
         * We need a way to assign one of two String values
         * depending on the result of a boolean condition.
         */

        /*
         * This is where the ternary operator is used.
         *
         * Syntax:
         *     condition ? valueIfTrue : valueIfFalse
         *
         * - The condition (income > 100_000) is evaluated first.
         * - If the condition is true, "First" is returned and assigned to className variable.
         * - If the condition is false, "Economy" is returned and assigned.
         */

        int income = 120_000 ;
        String className= income > 100_000 ? "First" : "Economy";
        System.out.println(className);
        // output: First
    }
}
