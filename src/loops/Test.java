package loops;

import java.util.Scanner;

// ============================================================
// Loop Questions in Java
// ============================================================

public class Test {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Question 1
        // How many times "Hello" is printed?
        // ============================================================

        /*
           Predict the output
           of the following loop.
        */

        for (int i = 0; i <= 5; i++) {

            System.out.println("Hello");

            i += 2;

        }



        // ============================================================
        // Question 2
        // Sum of Even and Odd Numbers
        // ============================================================

        /*
           Take numbers from user
           and calculate:

           1. Sum of Even Numbers
           2. Sum of Odd Numbers
        */

        int evenSum = 0;

        int oddSum = 0;

        System.out.print("How Many Numbers You Want to Enter: ");

        int n = sc.nextInt();



        // ============================================================
        // Taking Input
        // ============================================================

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter a Number: ");

            int number = sc.nextInt();



            // ========================================================
            // Checking Even or Odd
            // ========================================================

            if (number % 2 == 0) {

                evenSum += number;

            } else {

                oddSum += number;

            }

        }



        // ============================================================
        // Printing Result
        // ============================================================

        System.out.println("Sum of Even Numbers: " + evenSum);

        System.out.println("Sum of Odd Numbers: " + oddSum);



        // ============================================================
        // Question 3
        // Factorial of a Number
        // ============================================================

        /*
           Find factorial
           of a given number.
        */

        System.out.print("Enter a Number: ");

        int num = sc.nextInt();

        int factorial = 1;



        // ============================================================
        // Calculating Factorial
        // ============================================================

        for (int i = 1; i <= num; i++) {

            factorial *= i;

        }



        // ============================================================
        // Printing Factorial
        // ============================================================

        System.out.println("Factorial = " + factorial);



        // ============================================================
        // Question 4
        // Multiplication Table
        // ============================================================

        /*
           Print multiplication table
           of a given number.
        */

        System.out.print("Enter a Number: ");

        int tableNumber = sc.nextInt();



        // ============================================================
        // Printing Table
        // ============================================================

        for (int i = 1; i <= 10; i++) {

            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));

        }



        // Closing Scanner
        sc.close();

    }
}
