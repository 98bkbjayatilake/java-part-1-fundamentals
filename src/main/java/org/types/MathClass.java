package org.types;

public class MathClass {
    public static void main(String[] args) {
        /*
         * In this tutorial, we explore the Math class, which is used to perform
         * common mathematical operations in Java.
         *
         * The Math class belongs to the java.lang package, which is automatically
         * imported by the JVM. Therefore, we do not need to explicitly import it.
         *
         * The Math class provides many useful static methods such as round(), ceil(),
         * floor(), max(), and random().
         */

        System.out.println("round method in Math class");
        /*
         * The round() method is used to round a floating-point number to the
         * nearest whole number.
         *
         * This method is overloaded:
         * 1. round(float)  → returns an int
         * 2. round(double) → returns a long
         */
        int resultMath=Math.round(1.1F);
        System.out.println(resultMath);//output:1


        // int resultMathCeil=Math.ceil(1.1F);

        System.out.println("\nceil method in Math class");
        /*
         * The ceil() (ceiling) method returns the smallest integer value that is
         * greater than or equal to the given number.
         *
         * For example, the ceiling of 1.1 is 2.
         *
         * The ceil() method always returns a double, even if the result looks like
         * a whole number.
         * Therefore, explicit casting is required when storing the result in an int.
         */
        int resultMathCeil= (int)Math.ceil(1.1F);
        System.out.println(resultMathCeil);//output:2

        System.out.println("\nfloor method of Math class");

        /*
         * The floor() method returns the largest integer value that is
         * less than or equal to the given number.
         *
         * For example, the floor of 1.1 is 1.
         *
         * Similar to ceil(), this method also returns a double, so explicit
         * casting is required.
         */
        int resultMathFloor=(int) Math.floor(1.1F);
        System.out.println(resultMathFloor);//output:1


        System.out.println("\nmax method of Math class ");
        /*
         * The max() method returns the greater of two values.
         * It is commonly used for comparisons.
         */
        int resultMax=Math.max(10,20);
        System.out.println(resultMax);

        System.out.println("\ngenerating random numbers  between 0 to 1 by Math.random method");

        /*
         * The random() method generates a pseudo-random double value
         * between 0.0 (inclusive) and 1.0 (exclusive).
         *
         * Each time the program runs, a different value is produced.
         */
        double resultRandom=Math.random();
        System.out.println(resultRandom);//sample output:0.7643987624979596

        System.out.println("\ngenerating random numbers  between 0 to 100 by Math.random method");

        /*
         * To generate a random number within a specific range,
         * we can multiply the result of Math.random() by the desired limit.
         *
         * In this case, multiplying by 100 generates a value between 0 and 100.
         */
        double resultRandomModify=Math.random()*100;
        System.out.println(resultRandomModify);//sample output: 21.679961902722244

        System.out.println("\nround generated random numbers  between 0 to 100 by Math.random method");
        /*
         * If decimal values are not required, we can round the generated
         * number to the nearest integer using Math.round().
         */
        int resultRandomRound= (int)Math.round(Math.random()*100);
        System.out.println(resultRandomRound); //sample output: 61

        System.out.println("\ngenerated random numbers  between 0-100 by Math.random method and cast them to int(incorrect)");
        /*
         * This approach is incorrect due to operator precedence.
         *
         * Here, the cast is applied only to the result of Math.random(),
         * not to the entire expression.
         *
         * Since Math.random() returns a value between 0 and 1,
         * casting it to int always results in 0.
         *
         * Multiplying 0 by 100 still produces 0, which is why the output
         * is always zero.
         */
        int resultRandomWithoutRound= (int)Math.random()*100;
        System.out.println(resultRandomWithoutRound);

        System.out.println("\ngenerated random numbers  between 0-100 by Math.random method and cast them to int(correct)");
        /*
         * To fix this issue, the entire expression must be enclosed in parentheses
         * so that the multiplication occurs before the casting.
         *
         * This ensures the decimal portion is removed only after the value
         * has been scaled to the desired range.
         */
        int resultRandomWithoutRoundT= (int)(Math.random()*100);
        System.out.println(resultRandomWithoutRoundT);//sample output:60
    }
}
