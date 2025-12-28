package org.types;

public class PrimitiveTypesWholeNumbers {
    /* A byte is sufficient to store age values since it can represent numbers
     *  from -128 to 127 using only one byte of memory.
     */
    byte age=30;

    /* Suppose we want to store the number of times a YouTube video
     * (for example, an episode of "Battle Through the Heavens" Chinese animation)
     * (for example, an episode of "Battle Through the Heavens" Chinese animation)
     */

    /*
     * In Java, underscores can be used to improve the readability of large numbers by separating digits
     * (e.g., every three digits
     */

    /* The int type has a range of -2,147,483,648 to 2,147,483,647,
     * which is sufficient to store 1.5 billion views
     */
    int  btthEpisodeViewsCount=1_500_000_000;

    /* Now, suppose we want to store the number of views for another YouTube video
     * (for example, an episode of "Perfect World" Chinese animation),which has around 3 billion views.
     */

    /*
     * If we try to use an int, the compiler will throw an error because 3 billion
     * exceeds the maximum value an int can hold.
     */

    // int  perfectWorldEpisodeViewsCount=3_000_000_000; //Error

    /*
     * Even if we change the type to long, the error persists:
     */
    // long perfectWorldEpisodeViewsCount=3_000_000_000; //Still an error

    /*
     * This happens because, by default, Java interprets whole number literals as int.
     * The compiler still treats 3,000,000,000 as an int literal, which is out of range.
     */

    /*
     *  To fix this, we must explicitly tell Java to treat the number as a long literal
     *  by appending the suffix 'L'.
     *  It is recommended to use uppercase 'L' instead of lowercase 'l',
     *  since lowercase 'l' can be confused with the digit '1'.
     */
    long perfectWorldEpisodeViewsCount=3_000_000_000L;
}
