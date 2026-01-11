package org.controlflow;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
         * The for-each loop is used to iterate over arrays or collections.
         * It is simpler and more readable when index access is not required.
         */
        String[] fruits = { "Apple", "Mango", "Orange"};

        /*
         * We can iterate over an array using traditional loops (for, while, do-while).
         * Java also provides the for-each loop, which reduces boilerplate code.
         */

        // Traditional for loop approach
        // for (int i = 0; i< fruits.length; i++)
            //System.out.println(fruits[i]);

        /*
         * For-each loop syntax:
         * for (dataType variable : arrayName)
         *
         * - The variable type must match the array element type.
         * - Each iteration assigns one array element to the variable.
         * - No counter, condition, or increment is required.
         */
        System.out.println("for-each loop ");
        for(String fruit:fruits)
            System.out.println(fruit);

        /*
         * Limitation 1:
         * The for-each loop can only iterate forward.
         * To traverse from end to beginning, use a traditional for loop.
         */
        System.out.println("\nfor loop print items from the end to beginning");
        for (int i = fruits.length-1; i>=0; i--)
            System.out.println(fruits[i]);

        /*
         * Limitation 2:
         * The for-each loop does not provide access to indexes.
         * Use a traditional for loop when index access is required.
         */
    }
}
