package org.variables;

public class MainVariables {
    public static void main(String[] args) {
        //initialize a variable
        int age=30;
        System.out.println(age);
        age=35;
        System.out.println(age);

        //We can also copy the value of one variable into another
        int myAge= 38;
        int herAge =myAge;
        System.out.println(herAge);
    }
}
