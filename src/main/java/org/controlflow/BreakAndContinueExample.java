package org.controlflow;

import java.util.Scanner;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        /*
         * ORIGINAL IMPLEMENTATION (COMMENTED OUT)
         *
         * In this version, the loop condition checks whether
         * the input is equal to "quit".
         *
         * The loop:
         * - Terminates when the user types "quit"
         * - Skips printing when the user types "pass"
         */

        /*
         Scanner sc=new Scanner(System.in);
        String input="";

        while(!input.equals("quit")){
            System.out.println("User Input: ");
            input=sc.next().toLowerCase();

            if (input.equals("quit"))
                break;
            if(input.equals("pass"))
                continue;
            System.out.println("The User Input is: "+input);
        }
        */

        /*
         * SIMPLIFIED AND PREFERRED IMPLEMENTATION
         *
         * In this version, the loop condition is simply `true`.
         * This means the loop will run indefinitely.
         *
         * The loop termination is controlled entirely
         * by the break statement.
         *
         * When the user types "quit", the break statement
         * immediately terminates the loop.
         *
         * This pattern (while(true) with break) is very common
         * in professional Java programs, especially when
         * user input determines when the loop should end.
         */
        Scanner sc=new Scanner(System.in);
        String input="";

        while(true){
            System.out.print("User Input: ");
            input=sc.next().toLowerCase();

            if (input.equals("quit"))
                break;
            if(input.equals("pass"))
                continue;
            System.out.println("The User Input is: "+input);
        }
    }
}
