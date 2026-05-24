package loops;

import java.util.Scanner;

// ============================================================
// Sum of First N Natural Numbers in Java
// ============================================================

/*

In this program,
user enters a number (N)
and program calculates
the sum of first N natural numbers.

Example:

If N = 5

Sum = 1 + 2 + 3 + 4 + 5
     = 15

*/


public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Taking Input
        // ============================================================

        System.out.print("Enter a Number: ");

        int n = sc.nextInt();



        // ============================================================
        // Declaring Variables
        // ============================================================

        int sum = 0;

        int i = 1;



        // ============================================================
        // while Loop
        // ============================================================

        /*
           Loop runs from 1 to N
           and adds each number into sum.
        */

        while (i <= n) {

            sum += i;

            i++;

        }



        // ============================================================
        // Printing Result
        // ============================================================

        System.out.println("Sum of First N Natural Numbers: " + sum);



        // Closing Scanner
        sc.close();

    }
}



/*

Example

Input:
5

Output:
15

*/


// ============================================================
// Explanation
// ============================================================

/*

1. sum variable stores final result.

--------------------------------------------------

2. i starts from 1.

--------------------------------------------------

3. while(i <= n)

   Loop runs from 1 to N.

--------------------------------------------------

4. sum += i

   Adds current value of i into sum.

--------------------------------------------------

5. i++

   Increases value by 1.

*/
