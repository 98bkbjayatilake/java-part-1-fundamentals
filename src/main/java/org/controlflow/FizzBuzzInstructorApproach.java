package org.controlflow;

import java.util.Scanner;

public class FizzBuzzInstructorApproach {
    public static void main(String[] args) {
        /*
         * ------------------------------------------------------------
         * Problem: FizzBuzz
         * ------------------------------------------------------------
         * - Print "Fizz" if the number is divisible by 5
         * - Print "Buzz" if the number is divisible by 3
         * - Print "FizzBuzz" if the number is divisible by both 3 and 5
         * - Otherwise, print the number itself
         */

        /*
         * Initial (Incorrect) Approach – Explained
         *
         * The commented code below contains a logical bug.
         *
         * If the input is divisible by both 3 and 5 (e.g., 15),
         * the program incorrectly prints "Fizz" instead of "FizzBuzz".
         *
         * Reason:
         * - The first condition (number % 5 == 0) evaluates to true.
         * - Once a condition in an if-else chain is true, the remaining
         *   else-if blocks are skipped.
         * - As a result, the more specific condition is never reached.
         *
         * Lesson:
         * - In conditional chains, ALWAYS place the most specific
         *   conditions first and the most general ones last.
         */

        /*
        Scanner scanner= new Scanner(System.in);
        System.out.println("Number: ");
        int number= scanner.nextInt();

        if (number % 5 ==0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else
            System.out.println(number);
        */

        /*
         *
         * Correct Approach – Proper Condition Ordering
         *
         * The most specific condition (divisible by both 3 and 5)
         * is checked first to avoid premature execution.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.print("Number: ");
        int number= scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 ==0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        /*
         * ------------------------------------------------------------
         * DRY Principle (Don't Repeat Yourself)
         * ------------------------------------------------------------
         * Some developers argue that checking (number % 5 == 0)
         * multiple times violates the DRY principle.
         *
         * An alternative approach is to nest conditions to
         * reduce repetition while maintaining correct logic.
         */

        /*
        if (number % 5 == 0 ) {
            if(number % 3 ==0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        */
    }
}
