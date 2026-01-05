package org.controlflow;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
         * Sometimes we need to combine multiple boolean conditions
         * to make decisions in a program. Java provides logical
         * operators such as AND (&&), OR (||), and NOT (!)
         * for this purpose.
         */

        // ---------------- AND Operator ----------------
        System.out.println("AND Operator");

        /*
         * Declare a variable called temperature and assign a value.
         * We want to check whether the temperature is greater than 20
         * AND less than 30.
         */
        short temperature=22;

        /*
         * The logical AND (&&) operator returns true only if
         * both conditions are true.
         */
        boolean isWarm=temperature>20 && temperature<30;
        System.out.println(isWarm); // Output: true

        System.out.println("When one condition fail");

        /*
         * Change the temperature so that one condition becomes false.
         */
        temperature=12;
        boolean isWarmTwo=temperature>20 && temperature<30;
        System.out.println(isWarmTwo);//output :false

        /*
         * Java evaluates logical AND expressions from left to right.
         * If the first condition is false, Java does not evaluate
         * the remaining condition (short-circuit evaluation),
         * because the entire expression cannot be true.
         */

        // ---------------- OR Operator ----------------
        System.out.println("\nOR Operator");

        boolean hasHighIncome = true;
        boolean hasGoodCredit=true;


        /*
         * Example scenario: Loan eligibility system.
         * An applicant is eligible if they have either
         * a high income OR a good credit score.
         */
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible); // Output: true

        /*
         * With the OR (||) operator, the result is true if
         * at least one condition is true.
         * Java stops evaluating once it encounters a true condition.
         */

        System.out.println("When one condition fail");
        boolean hasHighIncomeTwo = false;
        boolean hasGoodCreditTwo = true;

        boolean isEligibleTwo=hasHighIncomeTwo || hasGoodCreditTwo;
        System.out.println(isEligibleTwo); // Output: true

        // ---------------- NOT Operator ----------------
        System.out.println("\nNOT Operator");

        /*
         * New rule:
         * An applicant is eligible for a loan if:
         * - They have either high income OR good credit
         * - AND they do NOT have a criminal record
         */
        boolean hasCriminalRecord = false;
        boolean hasHighIncomeThree = true;
        boolean hasGoodCreditThree= true;

        /*
         * The NOT (!) operator reverses a boolean value.
         * Since hasCriminalRecord is false, applying !
         * makes the condition true.
         */
        boolean isEligibleThree = (hasGoodCreditThree || hasHighIncomeThree) && !hasCriminalRecord ;
        System.out.println(isEligibleThree); // Output: true
    }
}
