package org.controlflow;

public class ForLoop {
    public static void main(String[] args) {

        /*
         * A `for` loop is used when you want to repeat one or more statements
         * a known number of times.
         *
         * Structure of a for loop:
         * for (initialization; condition; update) {
         *     loop body
         * }
         */

        /*
         * Execution flow of the following for loop:
         *
         * 1. Initialization:
         *    - `int i = 0` is executed first.
         *    - The loop counter `i` is initialized to 0.
         *
         * 2. Condition Evaluation:
         *    - The condition `i < 5` is evaluated.
         *    - If the condition is true, the loop body executes.
         *
         * 3. Loop Body Execution:
         *    - `System.out.println(...)` is executed.
         *
         * 4. Update Expression:
         *    - `i++` increments `i` by 1.
         *
         * 5. Repetition:
         *    - Steps 2 to 4 repeat until the condition becomes false.
         *
         * 6. Termination:
         *    - When `i` becomes 5, the condition `i < 5` evaluates to false.
         *    - Control exits the loop and continues with the next statement.
         */
        for(int i = 0; i < 5; i++)
            System.out.println("Hello World with increment: "+i);

        System.out.println("\n");

        for (int j=5;j>0;j--)
            System.out.println("Hello word with decrement: "+j);
    }
}
