package org.controlflow;

public class Switch {
    public static void main(String[] args) {
        /*
         * The switch statement is used to execute different blocks of code
         * based on the value of a variable or expression.
         * It serves as an alternative to multiple if–else statements
         * and can improve readability when working with fixed values.
         */

        /*
         * Scenario:
         * Assume we want to check the role of the current user and
         * display a message or grant features based on that role.
         */

       /*
        * One way to implement this logic is by using if–else statements:
        *
        * String role = "admin";
        *
        * if (role == "admin")
        *    System.out.println("You're an admin");
        * else if(role == "moderator")
        *    System.out.println("You're a moderator");
        * else
        *    System.out.println("You're a guest");
        *
        * While this approach works, it can become less readable
        * as the number of conditions increases.
        */

        /*
         * The same logic can be implemented using a switch statement,
         * which often results in cleaner and more structured code.
         */
        String role="admin";

        /*
         * The switch expression is evaluated once.
         * Execution jumps to the matching case label.
         */
        switch (role){
            case "admin":
                /*
                 * Code executed when the role is "admin".
                 */
                System.out.println("You're an admin");
                /*
                 * The break statement exits the switch block.
                 * Without it, execution would continue into the next case.
                 */
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                /*
                 * The default case executes when none of the defined
                 * case labels match the switch expression.
                 * It acts as the final fallback option.
                 */
                System.out.println("You're a guest");
                /*
                 * A break statement is not required here because
                 * this is the last block in the switch statement.
                 */
        }

        /*
         * Important note:
         * If a break statement is omitted in a case block,
         * Java will continue executing the subsequent case blocks.
         * This behavior is known as "fall-through".
         */

        /*
         * Switch statements are not limited to String values.
         * They can also be used with primitive types such as int,
         * as well as enums and certain wrapper types.
         */

        /*
         * Realistic integer-based example:
         * Assume different access levels are represented by integers.
         */

        int accessLevel = 2;

        switch (accessLevel) {

            case 1:
                System.out.println("Access Level 1: Read-only access");
                break;

            case 2:
                System.out.println("Access Level 2: Standard user access");
                break;

            case 3:
                System.out.println("Access Level 3: Administrative access");
                break;

            default:
                System.out.println("Unknown access level");
        }
    }
}
