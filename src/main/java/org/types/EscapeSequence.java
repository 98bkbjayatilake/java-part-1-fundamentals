package org.types;

public class EscapeSequence {
    public static void main(String[] args) {
        /*
         * In Java, there are situations where we need to include special characters
         * inside a String, such as:
         *  - Double quotes (")
         *  - Backslashes (\)
         *  - New lines (\n)
         *  - Tabs (\t)
         *
         * These characters cannot be written directly in a String literal because
         * the Java compiler may interpret them incorrectly.
         * To handle this, Java provides escape sequences using the backslash (\).
         */

        /*
         * Example: Including double quotes inside a String
         *
         * Suppose we want to display the text:
         * Hello "Bimsara"
         *
         * If we write:
         *   "Hello "Bimsara""
         * the compiler will assume the String ends at "Hello "
         * and will throw a compilation error.
         *
         * To solve this, we escape the double quotes using a backslash (\").
         */

        String message = "Hello \"Bimsara\"";//output: Hello "Bimsara"
        System.out.println(message);

        /*
         * Another important escape character is the backslash itself.
         *
         * Example: Storing a Windows directory path
         * A typical Windows path looks like:
         *   c:\Windows\...
         *
         * If we try to write:
         *   String directoryPath = "c:\";
         * the compiler treats \" as an escaped double quote,
         * which causes the String to be unterminated.
         *
         * To represent a single backslash in a String,
         * we must escape it using another backslash (\\).
         */

        // Although we write two backslashes in the code,
        // only one backslash appears in the actual output.
        String directoryPath="c:\\Windows\\....";
        System.out.println(directoryPath);  //output:  c:\Windows\....

        /*
         * The \n escape sequence is used to insert a new line
         * within a String.
         */
        String directoryPathTwo="c:\nWindows\\....";
        System.out.println(directoryPathTwo);
        /*
         * Output:
         * c:
         * Windows\....
         */

        /*
         * The \t escape sequence is used to insert a horizontal tab
         * inside a String, which helps with alignment in console output.
         */
        String directoryPathThree="c:\tWindows\\Desktop\\.....";
        System.out.println(directoryPathThree);
        /*
         *Output :
         * c:	Windows\Desktop\.....
         */
    }
}
