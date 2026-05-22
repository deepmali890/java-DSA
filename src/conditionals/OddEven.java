package conditionals;

import java.util.Scanner;

// ============================================================
// Odd or Even Number in Java
// ============================================================

/*

In this program,
we check whether a number
is Odd or Even using if-else statement.

*/


public class OddEven {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Taking Input
        // ============================================================

        System.out.print("Enter a Number: ");

        int number = sc.nextInt();



        // ============================================================
        // Checking Odd or Even
        // ============================================================

        /*
           If remainder is 0,
           then number is Even.

           Otherwise,
           number is Odd.
        */

        if (number % 2 == 0) {

            System.out.println("Even Number");

        } else {

            System.out.println("Odd Number");

        }


        // Closing Scanner
        sc.close();

    }
}



/*

Example 1

Input:
4

Output:
Even Number

--------------------------------------------------

Example 2

Input:
7

Output:
Odd Number

*/


// ============================================================
// Explanation
// ============================================================

/*

1. % is Modulus Operator.

--------------------------------------------------

2. Modulus Operator gives remainder.

--------------------------------------------------

3. If remainder is 0:

   Number is Even

--------------------------------------------------

4. If remainder is not 0:

   Number is Odd

--------------------------------------------------

5. Even Number:
   Divisible by 2

--------------------------------------------------

6. Odd Number:
   Not divisible by 2

*/
