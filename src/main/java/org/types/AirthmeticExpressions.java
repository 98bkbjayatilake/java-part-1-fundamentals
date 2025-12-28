package org.types;

public class AirthmeticExpressions {
    public static void main(String[] args) {
        // -------------------- Addition --------------------
        // Adds two integer values and stores the result
        int resultAdd=10 + 30;
        //System.out.println(resultAdd);

        // -------------------- Division --------------------
        /*
         * Here, resultDivision is an integer because in Java,
         * dividing two integers results in an integer value.
         * The decimal part is discarded (not rounded).
         *
         * If you want a floating-point result, at least one
         * operand must be converted (cast) to a float or double.
         */
        int resultDivision=10 / 3;
        System.out.println(resultDivision);//output: 3

        /*
         * To obtain a floating-point result, we explicitly cast
         * both operands to double. This forces Java to perform
         * floating-point division instead of integer division.
         */
        double resultDivisionFloat= (double)10 / (double)3;
        System.out.println(resultDivisionFloat);//output: 3.3333333333333335

        /*
         * The expression (double) 10 is called type casting.
         * Arithmetic operators include +, -, *, /, and %.
         * The numbers involved in an operation (e.g., 10, 30, 3)
         * are referred to as operands.
         */

        // -------------------- Increment and Decrement Operators --------------------
        int x=1;

        /*
         * To increase the value of x by one, we use the increment operator (++).
         * However, when this operator is used on the right side of an assignment,
         * it produces different results depending on whether it is postfix or prefix.
         */

        /* In this case ,because the increment operator is applied as a postfix,
         * the current value of x is first copied to y,so y becomes 1.
         * Then, x is incremented by 1.
         * Therefore, when we print values , x will be 2 and y will be 1
         */
        int y=x++;
        System.out.println("post increment");
        System.out.println("Value of x is "+x);
        System.out.println("Value of y is "+y);

        /* However if the increment operator(++) is applied as a prefix ,
         * the value of a is first  incremented by 1,so it(a) becomes 2.
         * Then updated value of a is copied to b.
         * As a result, both a and b will be 2.
         */
        int a=1;
        int b=++a;
        System.out.println("pre increment");
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);

        // -------------------- Compound Assignment Operators --------------------
        int c=1;
        /*
         * If you want to increase a variable by more than one,
         * there are two common approaches.
         */

        // Approach 1:
        // c = c + 2;

        // Approach 2 (preferred):
        // Use the compound (augmented) assignment operator
        c +=2;
        System.out.println(c);
    }
}
