package org.types;

public class PrimitiveTypesFloatNumbers {
    // If we try to assign a  decimal number  to a float variable directly
    // we get a compilation error:
    //  "Incompatible types .Found: 'double',required :'float' "

    //   Example (will not compile)
    //   float price= 10.99;

    /*
     *  Reason:
     *  By default , Java treats all decimal (floating-point) literals as double,
     *  which provides higher precision (64-bit) compared  to float(32-bit)
     *  So even though the variable is declared as float, the literal is interpreted as double.
     */

    /*
     *  Solution :
     *  Just like adding 'L' for long literals ,we need to explicitly specify a  float literal
     *  by appending the suffix 'f' or 'F'
     *
     *  Although both 'f' and 'F' are valid , 'F' is preferred for better readability
     */
    float price=10.99F;
}
