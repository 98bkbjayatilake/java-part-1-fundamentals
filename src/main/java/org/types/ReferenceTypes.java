package org.types;

import java.util.Date;
public class ReferenceTypes {
    byte age =30;

    /* .
     * Reference types differ from primitive types in how they are declared and used

     * - Classes such as Date belong to packages. For example:
     *        -java.util.Date->general-purpose  utility class for  working with dates
     *        -java.sql.Date->specialized for database operations
     *   Packages allow classes with the same name to coexist without conflict,
     *   since each resides in its own namespace
     *
     * -When we select a class (.g., java.util.Date) in Intellij, the IDE
     *  automatically adds the necessary import statement:
     *        import java.util.Date;
     *
     *  -To use a class from another package , we must import it.
     * /

     /*
     *  Memory Allocation
     *  -Primitive types (e.g., int,byte) do not require explicit memory allocation
     *   The Java Runtime Environment (JRE) handles their lifecycle automatically.
     *  -Reference types (e.g., Date, String, custom classes ) require explicit memory
     *   allocation using the 'new' operator .
     *   Example : Date now =new Date();
     *  -Memory release is still managed by Java Garbage Collector, so developers
     *   do not need to manually free memory
     */

    // Creating a new instance of the Date class (an object of type Date).
    Date now = new Date();

    /*
     * Objects and Members:
     * - Classes act as blueprints/templates for creating objects.
     * - Once we create an object, we can access its fields and methods using the dot (.) operator.
     *   Example: now.getTime() → returns the time value
     *
     * - Key difference:
     *      - Primitive types: do not have fields or methods.
     *      - Reference types: provide fields and methods for additional functionality.
     */
}
