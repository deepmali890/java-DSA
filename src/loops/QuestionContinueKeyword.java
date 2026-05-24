package loops;

import java.util.Scanner;

// ============================================================
// Continue Statement Question in Java
// ============================================================

/*

Keep taking numbers as input
from the user.

If number is multiple of 10,
skip that iteration using continue.

Otherwise print the number.

*/


public class QuestionContinueKeyword {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Infinite Loop
        // ============================================================

        do {

            System.out.print("Enter a Number: ");

            int number = sc.nextInt();



            // ========================================================
            // Checking Multiple of 10
            // ========================================================

            if (number % 10 == 0) {

                continue;

            }



            // ========================================================
            // Printing Number
            // ========================================================

            System.out.println("You Entered: " + number);

        } while (true);

    }
}



/*

Example

Input:
5
10
7
20

Output:

You Entered: 5
You Entered: 7

*/


// ============================================================
// Explanation
// ============================================================

/*

1. continue statement
   skips current iteration.

--------------------------------------------------

2. If number is multiple of 10,
   loop directly moves
   to next iteration.

--------------------------------------------------

3. Number divisible by 10
   does not print.

--------------------------------------------------

4. while(true)

   creates infinite loop.

--------------------------------------------------

5. % Operator checks remainder.

*/
