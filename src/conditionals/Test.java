package conditionals;

import java.util.Scanner;

// ============================================================
// Conditional Statements Questions in Java
// ============================================================

public class Test {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Question 1
        // Positive or Negative Number
        // ============================================================

        /*
           Write a Java program
           to check whether
           a number is positive or negative.
        */

        System.out.print("Enter a Number: ");

        int number = sc.nextInt();

        if (number >= 0) {

            System.out.println("Positive Number");

        } else {

            System.out.println("Negative Number");

        }



        // ============================================================
        // Question 2
        // Fever Checker
        // ============================================================

        /*
           Print:
           "You have a fever"

           if temperature is above 100.

           Otherwise print:
           "You don't have a fever"
        */

        double temperature = 103.5;

        if (temperature > 100) {

            System.out.println("You have a fever");

        } else {

            System.out.println("You don't have a fever");

        }



        // ============================================================
        // Question 3
        // Week Day Using Switch Statement
        // ============================================================

        /*
           Take week number (1-7)
           from user and print
           day name.
        */

        System.out.print("Enter Week Number: ");

        int week = sc.nextInt();

        switch (week) {

            case 1:

                System.out.println("Monday");

                break;

            case 2:

                System.out.println("Tuesday");

                break;

            case 3:

                System.out.println("Wednesday");

                break;

            case 4:

                System.out.println("Thursday");

                break;

            case 5:

                System.out.println("Friday");

                break;

            case 6:

                System.out.println("Saturday");

                break;

            case 7:

                System.out.println("Sunday");

                break;

            default:

                System.out.println("Invalid Input");

        }



        // ============================================================
        // Question 4
        // Ternary Operator
        // ============================================================

        /*
           Find value of x and y
           using ternary operator.
        */

        int a = 63;
        int b = 36;

        boolean x = (a < b) ? true : false;

        int y = (a > b) ? a : b;

        System.out.println("Value of x = " + x);

        System.out.println("Value of y = " + y);



        // ============================================================
        // Question 5
        // Leap Year Checker
        // ============================================================

        /*
           Write a Java program
           to check whether
           a year is Leap Year or not.
        */

        System.out.print("Enter a Year: ");

        int year = sc.nextInt();

        if (year % 4 == 0) {

            System.out.println("Leap Year");

        } else {

            System.out.println("Not a Leap Year");

        }



        // Closing Scanner
        sc.close();

    }
}
