package org.types;

public class ReferenceTypesString {
    public static void main(String[] args) {
        /*
         * The String class belongs to the java.lang package.
         * This package is automatically imported by the Java compiler,
         * so no explicit import statement is required to use the String class.
         *
         * Strings in Java are reference types, not primitive types.
         * They represent objects stored in memory.
         */

        // Traditional way of creating a String object using the 'new' keyword
        //String message = new String("Hello World");

        /*
         * The above approach is valid but not recommended for most use cases.
         * Java provides a shorthand way to create String objects using string literals.
         *
         * When a string literal is used, Java checks the String Constant Pool.
         * If the same literal already exists, it reuses the existing object,
         * making this approach more memory-efficient.
         *
         * Although it looks similar to primitive type initialization,
         * the String type is still a reference type.
         */

        String message = "Hello World";
        System.out.println(message);

        // Concatenate (join) two strings using the + operator
        String concatenateMessage="Hello World" + "!!";

        /*
         * Since String is a class in Java, it provides many built-in methods
         * that can be accessed using the dot (.) operator.
         *
         * The endsWith() method checks whether a string ends with a specified
         * character or sequence of characters.
         *
         * This method returns a boolean value:
         * - true  → if the condition is satisfied
         * - false → otherwise
         */

        System.out.println(concatenateMessage.endsWith("!!"));//output: true

        /*
         * The startsWith() method checks whether the string starts with
         * a given character or sequence of characters.
         */
        System.out.println(concatenateMessage.startsWith("!!"));//output: false

        /*
         * The length() method returns the total number of characters in the string.
         * This is commonly used for validating user input,
         * such as checking the length of a username or password.
         */
        System.out.println((concatenateMessage.length()));

        /*
         * The indexOf() method returns the index of the first occurrence
         * of a specified character or substring.
         *
         * Indexing in Java starts from 0.
         */
        System.out.println(concatenateMessage.indexOf("H"));// Output: 0
        System.out.println(concatenateMessage.indexOf("l")); // Output: 2
        /*
         * If the specified character or substring does not exist,
         * indexOf() returns -1.
         */
        System.out.println(concatenateMessage.indexOf("sky"));// Output: -1

        /*
         * The replace() method replaces occurrences of a target character
         * or substring with a replacement value.
         *
         * Parameters are variables defined in the method signature.(target and replacement)
         * Arguments are the actual values passed to the method.(excalmation marks(!) and asterix)
         *
         * Important:
         * Strings in Java are immutable, so this method does NOT modify
         * the original string. Instead, it returns a new string.
         */
        System.out.println(concatenateMessage.replace("!","*"));//output:Hello World**

        /*
         * The original string remains unchanged due to string immutability.
         */
        System.out.println(concatenateMessage);//output: Hello World!!

        /*
         * The toLowerCase() method converts all characters in the string
         * to lowercase.
         */
        System.out.println(concatenateMessage.toLowerCase());

        /*
         * The trim() method removes leading and trailing whitespace.
         * This is useful when handling user input where extra spaces
         * may be unintentionally entered.
         */
        String concatenateMessageNotTrim="     Hello World" + "!!      ";

        System.out.println(concatenateMessageNotTrim);
        System.out.println(concatenateMessageNotTrim.trim());
    }
}
