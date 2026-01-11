package org.controlflow;

import java.util.Scanner;

public class BreakContinueWithLoops {
    public static void main(String[] args) {

        /*
         * In addition to the break statement, Java also provides
         * the continue statement.
         *
         * The continue statement does NOT terminate the loop.
         * Instead, it skips the remaining statements in the current
         * iteration and moves control back to the beginning of the loop.
         *
         * In this example:
         * - If the user types "quit", the loop should terminate.
         * - If the user types "pass", the input should be ignored,
         *   and the program should ask the user for input again.
         */

        Scanner sc=new Scanner(System.in);
        String input="";
        while(!input.equals("quit")){
            System.out.print("User Input: ");
            input=sc.next().toLowerCase();

            /*
             * If the user enters "quit", exit the loop immediately
             * using the break statement.
             */
            if(input.equals("quit"))
                break;

            /*
             * If the user enters "pass", skip the rest of the current
             * loop iteration.
             *
             * When Java encounters the continue statement, it jumps
             * directly to the loop condition:
             *     while (!input.equals("quit"))
             *
             * As a result, the print statement below is ignored,
             * and the input "pass" is NOT printed to the terminal.
             */
            if(input.equals("pass"))
                continue;

            /*
             * This statement executes only when the input is neither
             * "quit" nor "pass".
             */
            System.out.println("The user Input is: "+input);
        }
        /*
         * This example demonstrates the difference between:
         * - break    → terminates the loop completely
         * - continue → skips the current iteration and continues the loop
         */
    }

}
