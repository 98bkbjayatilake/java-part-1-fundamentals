package org.types;

import java.util.Arrays;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        /*
         * In addition to single-dimensional arrays, Java supports multidimensional arrays.
         * A common example is a two-dimensional array, which can be used to represent
         * a matrix (rows and columns). Similarly, three-dimensional arrays can be used
         * to represent more complex structures such as cubes.
         *
         * Multidimensional arrays are frequently used in scientific computations,
         * image processing, and mathematical applications.
         */

        /*
         * Below is an example of a two-dimensional array declaration.
         * To convert a one-dimensional array into a two-dimensional array,
         * we add an extra pair of square brackets.
         */

        //int [][] numbers=new int[5]; // Compilation error: dimensions must match

        /*
         * The above line causes a compilation error because a two-dimensional array
         * requires two dimensions on both sides of the declaration.
         *
         * In this example, we create a 2 × 3 matrix:
         * - 2 rows
         * - 3 columns
         */
        int [][] numbers=new int[2][3];

        /*
         * To access or modify an individual element in a two-dimensional array,
         * we must specify two indices:
         * - The first index represents the row
         * - The second index represents the column
         *
         * Here, we assign the value 1 to the element in the first row and first column.
         */
        numbers[0][0]=1;

        /*
         * Using Arrays.toString() on a multidimensional array prints memory references
         * instead of the actual contents, which results in unreadable output.
         */
        System.out.println(Arrays.toString(numbers));//output: [[I@6acbcfc0, [I@5f184fc6]

        /*
         * To properly display the contents of a multidimensional array,
         * we should use Arrays.deepToString(), which recursively converts
         * nested arrays into a readable string format.
         */
        System.out.println(Arrays.deepToString(numbers));//output: [[1, 0, 0], [0, 0, 0]]

        /*
         * Java also supports three-dimensional arrays.
         * To create one, simply add another pair of square brackets
         * and specify the size of the third dimension.
         *
         * The following array has:
         * - 2 blocks
         * - 3 rows per block
         * - 5 columns per row
         */
        int [][][] numbersThree=new int[2][3][5];

        /*
         * Multidimensional arrays can also be initialized using
         * the curly brace (initializer) syntax.
         *
         * In the example below:
         * - Each inner array represents a row
         * - The number of elements in each inner array represents columns
         *
         * {1, 2, 3} → First row (3 columns)
         * {4, 5, 6} → Second row (3 columns)
         */
        int [][] numbersTwoDimentional= {{1,2,3},{4,5,6}};

        /*
         * Using Arrays.deepToString() again allows us to print
         * the contents of the two-dimensional array correctly.
         */
        System.out.println(Arrays.deepToString(numbersTwoDimentional));
    }
}
