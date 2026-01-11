package org.controlflow;

import java.util.Scanner;

public class FizzBuzzMyApproach {
    public static void main(String[] args) {
        // This is my own implementation of the FizzBuzz exercise, written while self-studying
        // Java fundamentals using reference material from the "Ultimate Java Fundamentals: Part 1"
        // course on the Code with Mosh platform.
        System.out.print("Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean canDivideByThree = (number % 3 == 0);
        boolean canDivideByFive = (number % 5 == 0);


        if(canDivideByThree && canDivideByFive) {
            System.out.println("FizzBuzz");
        }
        else{
            if (canDivideByThree)
                System.out.println("Buzz");
            else if(canDivideByFive)
                System.out.println("Fizz");
            else
                System.out.println(number);
        }

    }
}
