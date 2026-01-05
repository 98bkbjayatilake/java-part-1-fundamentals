package org.controlflow;

public class SimplifyIfStatements {
    public static void main(String[] args) {
        /*
         * Scenario:
         * If the income is greater than 100,000, the variable hasHighIncome
         * should be set to true; otherwise, it should be set to false.
         */

        /*
        * Traditional approach using an if statement:
        *
        * int income = 120_000;
        * boolean hasHighIncome = false ;
        *
        * if(income>100_000)
        *    hasHighIncome=true;
        *
        * While this works correctly, it can be simplified.
        */

        /*
         * Improved approach:
         * The expression (income > 100_000) itself evaluates to a boolean value.
         * - If the condition is true, hasHighIncome will be true.
         * - If the condition is false, hasHighIncome will be false.
         *
         * This approach is more concise, readable, and professional.
         */

        /*
         * Although parentheses are not technically required here,
         * enclosing the condition in parentheses improves clarity
         * and makes the code easier to read.
         */
        int income = 120_000;
        boolean hasHighIncome= (income > 100_000) ;
        System.out.println(hasHighIncome);
    }
}
