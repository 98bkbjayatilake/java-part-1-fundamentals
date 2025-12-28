package org.types;

public class Casting {
    public static void main(String[] args) {
        System.out.println("implicit casting");
        /*
         * In this tutorial, we are going to talk about casting and type conversion in Java.
         * Let's start by declaring a short variable called x and assigning it the value 1.
         * Then we declare an int variable called y and assign it the value of x + 2.
         * Here, we are adding a short and an int.
         */
        short x=1;
        int y=x+2;
        System.out.println(y);//output: 3

        /*
         * This result is expected, but let’s understand what happens internally.
         * In the expression (x + 2), Java is dealing with two different data types:
         * - x is of type short (2 bytes)
         * - 2 is an int literal (4 bytes)
         *
         * Before performing the addition, Java promotes the short value to an int.
         * Java creates an anonymous temporary int value, copies the value of x into it,
         * and then performs the addition.
         *
         * This process is called implicit casting (or implicit type conversion).
         * It happens automatically when converting a smaller data type to a larger one.
         *
         * In Java, numeric type promotion follows this hierarchy:
         * byte → short → int → long → float → double
         *
         * A value is always promoted to the widest type involved in the expression.
         */

        /*
         * Now let’s look at floating-point numbers.
         * An int represents whole numbers, while a double can represent decimal values.
         * Even though an int uses 4 bytes and a double uses 8 bytes,
         * an int can be implicitly converted to a double.
         * This is also an example of implicit casting.
         */
        double a =1.1;
        double b= a +2;
        System.out.println(b);//output:3.1

        /*
         * In the expression (a + 2), Java automatically converts the integer 2 to 2.0
         * because double is more precise than int.
         * Then the addition is performed between two double values.
         */

        /*
         * Now let’s look at long and float.
         * Although long uses 8 bytes and float uses only 4 bytes,
         * Java allows implicit conversion from long to float.
         *
         * This is because Java decides widening conversions based on value range,
         * not memory size.
         *
         * However, float is less precise than long, so precision loss may occur.
         */
        long c=1568;
        float d=2.1f+c;
        System.out.println(d); // Output: 1570.1 (accurate)

        /*
         * In this case, the value of the long variable can be represented accurately
         * in a float, so no visible precision loss occurs.
         */

        long e=1568899999;
        float f=2.1f+e;
        System.out.println(f); // Output: 1.5689E9 (inaccurate due to loss of precision)

        /*
         * Here, the long value is too large to be represented exactly by a float.
         * As a result, Java still allows the implicit conversion,
         * but the output becomes inaccurate.
         *
         * Summary:
         * - Java follows a strict numeric type promotion hierarchy.
         * - Implicit casting happens automatically when converting to a wider type.
         * - Conversions are based on value range, not byte size.
         * - long → float is allowed, but may cause loss of precision.
         */

        System.out.println("explicit casting");

        /*
         * So far, we have seen implicit (automatic) casting.
         * Now let’s look at explicit casting.
         *
         * Suppose we want the result to be stored as an integer and we do not
         * care about the digits after the decimal point.
         * In this case, we must explicitly tell Java how to convert the value.
         *
         * This is done using explicit casting.
         */
        double g=4.12;

        /*
         * Here, g is a double. By explicitly casting g to int,
         * the decimal part is truncated (not rounded).
         *
         * (int) g → 4
         * Then 4 + 2 → 6
         */
        int h= (int)g + 2;
        System.out.println(h);// Output: 6

        System.out.println("\n convert types using wrapper classes");

        /*
         * Explicit casting only works between compatible primitive numeric types.
         *
         * Compatible primitive hierarchy:
         * byte → short → int → long → float → double
         *
         * However, we cannot cast a String directly to a number,
         * because String is not a primitive numeric type.
         */

        /*
         * To convert between Strings and primitive values,
         * Java provides wrapper classes for each primitive type.
         *
         * Examples:
         * int    → Integer
         * short  → Short
         * float  → Float
         * double → Double
         *
         * These wrapper classes are part of the java.lang package.
         */

        /*
         * The Integer class provides a method called parseInt(),
         * which takes a String and returns an int value.
         *
         * This is not casting — this is parsing.
         */
        String i="10";
        int j= Integer.parseInt(i) + 2;
        System.out.println(j);//output:12

        /*
         * Why does this matter?
         *
         * In most real-world applications (desktop, mobile, or web),
         * user input is received as Strings.
         * Examples include:
         * - Text fields
         * - Drop-down lists
         * - Form inputs
         *
         * To perform arithmetic operations, we must first convert
         * these String values into their numeric representations.
         */

        /*what if l is a floating point number
         * What will happen when we try to pare l as an integer*/

        /*
         * What happens if the String contains a floating-point value
         * and we try to parse it as an integer?
         *
         * Example:
         * String l="10.2";
         * int m= Integer.parseInt(l) + 2;
         * System.out.println(m);
         *
         * This will cause a NumberFormatException at runtime,
         * because "10.2" is not a valid integer.
         */

        /*
         * If the input contains decimal values,
         * we should use Float or Double wrapper classes instead.
         */
        String l="10.245";
        float m= Float.parseFloat(l) + 2;
        System.out.println(m);//output:12.245
    }
}
