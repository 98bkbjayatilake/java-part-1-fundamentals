package org.controlflow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Example 1: Basic while loop

        /*
        int k=5;
        while (k>0){
            System.out.println("Hello world with while loop: "+k);
            k--;
        }*/

        /*
         * Both `for` loops and `while` loops can be used to repeat code.
         *
         * - Use a `for` loop when you know in advance how many times
         *   the code should execute.
         * - Use a `while` loop when the number of iterations is not known
         *   ahead of time and depends on a condition that changes at runtime.
         */

        /*
         * ===============================
         * Example 2: User-driven while loop
         * ===============================
         *
         * Scenario:
         * Continuously ask the user for input until they type "quit".
         * Once "quit" is entered, the program terminates.
         *
         * In this situation, we do NOT know how many times the loop
         * will run because it depends entirely on user behavior.
         * This makes a while loop the appropriate choice.
         */

        /*
         * There is no counter variable in this example.
         * Instead, the loop condition is based on the user's input value.
         */

         /*
         * Incorrect approach:
         *
         * String input ="";
         * while (input != "quit"){}
         *
         * This does NOT work because `String` is a reference type.
         * Using comparison operators (== or !=) compares memory addresses,
         * not the actual string content.
         *
         * Two String objects containing "quit" may exist at different
         * memory locations, causing the comparison to fail.

        /*
         * Correct approach:
         *
         * To compare the actual value of strings, we must use
         * the `equals()` method provided by the String class.
         */

        Scanner scanner=new Scanner(System.in);
        String input ="";

        /*
         * Loop continues until the user enters "quit".
         *
         * The `equals()` method compares string values correctly.
         * The `toLowerCase()` method ensures the comparison is
         * case-insensitive, allowing inputs such as:
         * "QUIT", "Quit", or "qUiT".
         */
        while(!input.equals("quit")){
            System.out.print("User Input: ");
            input=scanner.next().toLowerCase();
            System.out.println("The user Input is "+input);
        }
    }
}
