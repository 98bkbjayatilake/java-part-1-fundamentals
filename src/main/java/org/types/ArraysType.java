package org.types;
import  java.util.Arrays;
public class ArraysType {
    public static void main(String[] args) {
        /*
         * Arrays are used to store multiple values of the same data type
         * under a single variable name.
         * Examples: a list of numbers, people, or messages.
         *
         * Since arrays are reference types in Java, we must use the
         * 'new' keyword to create them.
         * Inside the square brackets, we specify the size (length) of the array.
         */
        int [] numbers=new int[5];

        /*
         * We can access and assign values to individual elements in the array
         * using their index.
         * Array indexes start from 0.
         */
        numbers[0]=1;
        numbers[1]=2;

        /*
         * When we print an array directly, Java does not display
         * its actual elements.
         */
        System.out.println(numbers);//output: [I@6acbcfc0

        /*
         * We get this weird string instead of the actual items in the array.
         * This happens because, by default, when we print an array,
         * Java returns a string based on the memory address of the array object.
         *
         * If we create another array and print it, the output will be different,
         * because each array object is stored in a different memory location.
         */

        /*
         * To view the actual elements of an array, Java provides
         * the Arrays class in the java.util package.
         *
         * The toString() method of the Arrays class returns
         * a readable string representation of the array contents.
         */
        System.out.println(Arrays.toString(numbers)); //output:[1, 2, 0, 0, 0]

        /*
         * Only the first two elements were explicitly initialized.
         * The remaining elements are automatically assigned default values.
         *
         * Default values:
         * - int arrays     → 0
         * - boolean arrays → false
         * - String arrays  → null(empty string)
         */

        /*
         * Creating an array and assigning values one by one
         * can be tedious and less readable.
         *
         * If the values are known in advance, Java provides
         * a simpler and cleaner way to initialize arrays.
         */

        /*
         * Here, we use curly braces to directly initialize
         * the array with predefined values.
         */
        int[] numbersSetTwo= {2 ,3, 5, 1, 4};
        System.out.println(Arrays.toString(numbersSetTwo));

        /*
         * The length field returns the total number of elements
         * in the array.
         */
        System.out.println(numbersSetTwo.length);

        /*
         * Arrays in Java have a fixed size.
         * Once an array is created, we cannot add or remove elements.
         *
         * If we need a collection that can grow or shrink dynamically,
         * we should use collection classes such as ArrayList.
         */

        /*
         * The Arrays.sort() method sorts the elements of the array
         * in ascending order.
         */
        Arrays.sort(numbersSetTwo);
        System.out.println(Arrays.toString(numbersSetTwo));
    }
}
