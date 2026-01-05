package org.controlflow;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
         * Comparison operators are used to compare primitive values.
         * They evaluate expressions and return a boolean result (true or false).
         */
        int x = 1;
        int y = 1;

        /*
         * The equality operator (==) checks whether two values are equal.
         * If both values are the same, the result is true.
         */
        System.out.println(x==y);//output : true

        /*
         * The inequality operator (!=) checks whether two values are not equal.
         * If the values are different, the result is true.
         */
        System.out.println(x!=y); //output:false

        byte a=5;
        byte b=10;
        /*
         * Java also provides relational operators:
         * >  : greater than
         * <  : less than
         * >= : greater than or equal to
         * <= : less than or equal to
         *
         * In the example below, 'a' is less than 'b',
         * so the expression evaluates to true.
         */
        System.out.println(a<=b);//output true
    }
}
