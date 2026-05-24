package loops;

import java.util.Scanner;

// ============================================================
// Break Statement Question in Java
// ============================================================

/*

Keep taking numbers as input
from the user
until user enters
a multiple of 10.

*/


public class QuestionBreakKeyword {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // do-while Loop
        // ============================================================

        do {

            System.out.print("Enter a Number: ");

            int number = sc.nextInt();



            // ========================================================
            // Checking Multiple of 10
            // ========================================================

            if (number % 10 == 0) {

                break;

            }



            // ========================================================
            // Printing Number
            // ========================================================

            System.out.println("You Entered: " + number);

        } while (true);



        // Closing Scanner
        sc.close();

    }
}



/*

Example

Input:
5
7
13
20

Output:

You Entered: 5
You Entered: 7
You Entered: 13

Loop Stops

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Loop runs continuously
   using:

   while(true)

--------------------------------------------------

2. % Operator checks remainder.

--------------------------------------------------

3. If number % 10 == 0

   Number is multiple of 10.

--------------------------------------------------

4. break statement
   immediately stops loop.

--------------------------------------------------

5. Numbers not divisible by 10
   get printed.

*/
