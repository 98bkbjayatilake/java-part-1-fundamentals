package org.controlflow;

public class IfStatements {
    public static void main(String[] args) {
        /*
         * If statements allow a program to make decisions based on conditions.
         * The program executes different blocks of code depending on whether
         * a condition evaluates to true or false.
         *
         * Example logic:
         * - If the temperature is greater than 30:
         *      → Display "It's a hot day"
         *      → Display "Drink plenty of water"
         * - Else if the temperature is between 21 and 30:
         *      → Display "It's a nice day"
         * - Otherwise:
         *      → Display "It's cold"
         */

        /*
         * The expression inside the parentheses of an if statement must be
         * a boolean expression (true or false).
         * If the condition evaluates to true, the associated code block executes.
         */

        /*
        int temp = 32;
        if (temp > 30)
            System.out.println("It's a hot day");
        */

        int temp = 32;
        /*
         * When a condition is true and multiple statements need to be executed,
         * curly braces are required to define a code block.
         */
        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }

        /*
         * This condition checks if the temperature is greater than 20.
         * We do not need to explicitly check (temp <= 30) here because:
         * - If execution reaches this block, the first condition (temp > 30)
         *   has already evaluated to false.
         * - Therefore, the temperature is guaranteed to be 30 or less.
         */
        else if (temp>20)
            /*
             * Curly braces are optional when only a single statement
             * needs to be executed.
             */
            System.out.println("It's a nice day");
        else
            /*
             * The else block executes when none of the above conditions are true.
             * At this point, the temperature is 20 or below.
             * Since there are no additional conditions to evaluate, this block
             * acts as the final default case in the decision structure.
             */
            System.out.println("It's cold");

    }
}
