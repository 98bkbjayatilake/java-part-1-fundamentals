package org.controlflow;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * The do-while loop is similar to the while loop, with one
         * critical difference:
         *
         * The loop body is executed at least once, regardless of
         * whether the condition is true or false.
         *
         * This happens because the condition is evaluated
         * after the loop body executes.
         */

        Scanner scanner=new Scanner(System.in);
        String input ="";

        do{
           System.out.print("User Input: ");
           input=scanner.next().toLowerCase();
           System.out.println("The user Input is "+input);
       } while (!input.equals("quit"));

        /*
         * ===============================
         * Comparison: while vs do-while
         * ===============================
         *
         * while loop:
         * - Condition is checked before the loop body executes
         * - If the condition is false initially, the loop body
         *   will never execute
         *
         * do-while loop:
         * - Condition is checked after the loop body executes
         * - The loop body always executes at least once,
         *   even if the condition is false from the beginning
         *
         * This execution order is the ONLY functional difference
         * between while and do-while loops.
         */
    }
}
