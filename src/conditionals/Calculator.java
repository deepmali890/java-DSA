package conditionals;

import java.util.Scanner;

// ============================================================
// Simple Calculator in Java
// ============================================================

/*

In this program,
we perform basic mathematical operations
using Switch Statement.

Operators:

+  -> Addition
-  -> Subtraction
*  -> Multiplication
/  -> Division
%  -> Modulus

*/


public class Calculator {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Taking Input
        // ============================================================

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);



        // ============================================================
        // Switch Statement
        // ============================================================

        switch (operator) {

            case '+':

                System.out.println("Addition: " + (a + b));

                break;

            case '-':

                System.out.println("Subtraction: " + (a - b));

                break;

            case '*':

                System.out.println("Multiplication: " + (a * b));

                break;

            case '/':

                System.out.println("Division: " + (a / b));

                break;

            case '%':

                System.out.println("Modulus: " + (a % b));

                break;

            default:

                System.out.println("Invalid Operator");

        }



        // Closing Scanner
        sc.close();

    }
}



/*

Example 1

Input:
10
5
+

Output:
Addition: 15

--------------------------------------------------

Example 2

Input:
10
5
*

Output:
Multiplication: 50

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Scanner is used
   to take input from user.

--------------------------------------------------

2. charAt(0)
   takes first character input.

--------------------------------------------------

3. switch checks operator value.

--------------------------------------------------

4. Matching case executes.

--------------------------------------------------

5. break stops execution
   after matching case.

--------------------------------------------------

6. default runs when
   operator is invalid.

*/
