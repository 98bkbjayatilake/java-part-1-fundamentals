package org.types;

import java.awt.*;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // Demonstration of the difference between primitive and reference types in terms of memory management

        // --- PRIMITIVE TYPE EXAMPLE ---
        /* Declare a primitive variable 'x' and copy its value to 'y'.
         * Primitive types store the actual value directly in memory.
         * Each variable has its own independent memory location. */
        byte x = 1;
        byte y=x;

        // Update x and show that y remains unaffected
        x=2;
        System.out.println(y);// output: 1
        // Explanation: 'y' is not affected because it has its own independent copy of the value

        // --- REFERENCE TYPE EXAMPLE ---
        /* Reference types store a reference (memory address) to the actual object, not the object itself.
         * Using the Point class from java.awt package to illustrate this behavior. */
        Point point1 = new Point(1,1);

        // Copy the reference of point1 to point2
        Point point2 = point1;

        /* Explanation:
         * 1. Memory is allocated for the Point object, and 'point1' stores the reference to that object.
         * 2. When 'point2' is assigned 'point1', it copies the reference, not the actual object.
         * 3. Both 'point1' and 'point2' now refer to the same object in memory.
         * 4. Any changes made through one reference will be reflected when accessing the object through the other reference. */
        point1.x=2;
        System.out.println(point2);//output : java.awt.Point[x=2,y=1]
    }
}
