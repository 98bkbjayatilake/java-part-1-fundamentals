package org.types;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        /*
         * In this tutorial, we learn how to read input from the user.
         * Java provides the Scanner class (in the java.util package)
         * to read input from various sources such as the keyboard, files, etc.
         */

        /*
         * When creating a Scanner object, we must specify the input source.
         * System.in represents the standard input stream (keyboard input).
         */

        Scanner scanner=new Scanner(System.in);

        /*
         * System.in and System.out are fields of the System class.
         * - System.in  : used to read input from the console
         * - System.out : used to display output on the console
         */

        /*
         * The Scanner class provides several methods for reading data.
         * These methods usually start with the keyword 'next', such as:
         * - nextByte()    : reads a byte value
         * - nextBoolean() : reads a boolean value
         * - next()        : reads a single word (token)
         * - nextLine()    : reads an entire line of input
         */


        /*
         * The next() method reads only one token at a time.
         * A token is separated by whitespace (spaces, tabs, or new lines).
         * Therefore, if the user enters multiple words,
         * only the first word will be read.
         *
         * Example:
         * Input  : "Bimsara Jayatilake"
         * Output : "Bimsara"
         *
         * This behavior is not ideal when we want to read full names or sentences.
         */

        //System.out.println("Name: ");
        //String name=scanner.next();
        //System.out.println("You are "+name);


        /*
         * To read an entire line of text (including spaces),
         * we should use the nextLine() method.
         * This method reads everything until the Enter key is pressed.
         */

        //System.out.print("Name: ");
        //String name=scanner.nextLine();
        //System.out.println("You are "+name);


        /*
         * If the user enters leading or trailing spaces,those spaces will also be included in the input.
         * Calling trim() removes any unnecessary whitespace
         * from the beginning and end of the input.
         */
        System.out.print("Name: ");
        String name=scanner.nextLine().trim();
        System.out.println("You are "+name);
        /*
         * Example:
         * Input  : "      Bimsara Jayatilake"
         * Output : "You are Bimsara Jayatilake"
         */
    }
}
