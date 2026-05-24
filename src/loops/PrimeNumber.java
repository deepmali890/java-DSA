package loops;

import java.util.Scanner;

// ============================================================
// Prime Number in Java
// ============================================================

/*

A Prime Number is a number
that has only two factors:

1 and the number itself.

Examples:

2
3
5
7
11

Not Prime:

4
6
8
9

*/


public class PrimeNumber {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Taking Input
        // ============================================================

        System.out.print("Enter a Number: ");

        int number = sc.nextInt();



        // ============================================================
        // Special Case for 2
        // ============================================================

        if (number == 2) {

            System.out.println(number + " is a Prime Number");

        } else {

            boolean isPrime = true;



            // ========================================================
            // Checking Prime Number
            // ========================================================

            /*
               Loop checks whether
               number is divisible
               by any value between 2 and number-1.
            */

            for (int i = 2; i <= number - 1; i++) {

                if (number % i == 0) {

                    isPrime = false;

                }

            }



            // ========================================================
            // Printing Result
            // ========================================================

            if (isPrime == true) {

                System.out.println(number + " is a Prime Number");

            } else {

                System.out.println(number + " is not a Prime Number");

            }

        }



        // Closing Scanner
        sc.close();

    }
}



/*

Example 1

Input:
7

Output:
7 is a Prime Number

--------------------------------------------------

Example 2

Input:
8

Output:
8 is not a Prime Number

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Prime Number

   Has only 2 factors:
   1 and itself.

--------------------------------------------------

2. % Operator

   Checks remainder.

--------------------------------------------------

3. If remainder becomes 0,
   number is divisible.

--------------------------------------------------

4. If divisible by any number
   between 2 and n-1:

   Number is not prime.

--------------------------------------------------

5. boolean isPrime

   Stores true or false result.

*/
