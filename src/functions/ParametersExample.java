package functions;

import java.util.Scanner;

// ============================================================
// Parameters Example in Java
// ============================================================

/*

Parameters are variables
that receive values
from function call.

Functions become dynamic
using parameters.

*/


public class ParametersExample {



    // ============================================================
    // Function Definition
    // ============================================================

    /*
       num1 and num2
       are parameters.
    */

    public static void calculateSum(int num1, int num2) {

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

    }



    // ============================================================
    // Main Method
    // ============================================================

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ========================================================
        // Taking Input
        // ========================================================

        System.out.print("Enter First Number: ");

        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");

        int num2 = sc.nextInt();



        // ========================================================
        // Function Call
        // ========================================================

        /*
           num1 and num2
           are arguments here.
        */

        calculateSum(num1, num2);



        // Closing Scanner
        sc.close();

    }
}



/*

Example

Input:
10
20

Output:
Sum = 30

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Parameters

   Variables inside function definition.

   Example:

   int num1, int num2

--------------------------------------------------

2. Arguments

   Actual values passed
   during function call.

   Example:

   calculateSum(num1, num2);

--------------------------------------------------

3. void

   Means function returns nothing.

--------------------------------------------------

4. Function Call

   Executes function code.

--------------------------------------------------

5. Functions with parameters
   are reusable and dynamic.

--------------------------------------------------

6. If function returns value:

   return sum;

   Then return type changes from:

   void -> int

*/
