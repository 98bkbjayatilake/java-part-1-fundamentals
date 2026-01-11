package org.controlflow;

import java.util.Scanner;

public class BreakWithLoops {
    public static void main(String[] args) {

        /*
         * INITIAL APPROACH (COMMENTED OUT)
         *
         * This program repeatedly asks the user for input and echoes it back.
         * The loop should terminate when the user types "quit".
         *
         * Problem:
         * Even when the user types "quit", the word "quit" is also printed
         * before the program terminates.
         */

        /*
        Scanner scanner = new Scanner(System.in);
        String input ="";
        while(!input.equals("quit")){
            System.out.print("User Input: ");
            input=scanner.next().toLowerCase();
            System.out.println("The user Input is "+input);
        }
        */

        /*
         * FIRST SOLUTION
         *
         * One way to fix this issue is to check the input value
         * BEFORE printing it.
         *
         * If the user enters "quit", we simply skip the print statement.
         */

        /*
        Scanner scanner=new Scanner(System.in);
        String input ="";
        while(!input.equals("quit")){
            System.out.print("User Input: ");
            input=scanner.next().toLowerCase();
            if(!input.equals("quit"))
              System.out.println("The user Input is "+input);
        }
         */

        /*
         * SECOND SOLUTION – USING THE break STATEMENT
         *
         * In this approach, we reverse the condition logic.
         *
         * If the user types "quit", we immediately exit the loop
         * using the break statement.
         *
         * When Java encounters a break statement, it terminates
         * the loop instantly and ignores all remaining statements
         * inside the loop.
         */
        Scanner scanner=new Scanner(System.in);
        String input ="";
        while(!input.equals("quit")){
            System.out.print("User Input: ");
            input=scanner.next().toLowerCase();

            // If the user types "quit", exit the loop immediately
            if(input.equals("quit"))
                break;
            // This line executes only if the input is NOT "quit"
            System.out.println("The user Input is "+input);
        }
    }
}
