package loops;

// ============================================================
// Print Digits in Reverse Order
// ============================================================

/*

In this program,
we print digits of a number
in reverse order.

Example:

10899

Output:

9 9 8 0 1

*/


public class ReverseNumber {

    public static void main(String[] args) {

        // Declaring Variable
        int number = 10899;



        // ============================================================
        // while Loop
        // ============================================================

        /*
           Logic:

           1. Take last digit using %
           2. Print last digit
           3. Remove last digit using /
        */

        while (number > 0) {

            int lastDigit = number % 10;

            System.out.print(lastDigit + " ");

            number = number / 10;

        }

    }
}



/*

Output:

9 9 8 0 1

*/


// ============================================================
// Explanation
// ============================================================

/*

1. % Operator

   Used to get last digit.

--------------------------------------------------

2. / Operator

   Used to remove last digit.

--------------------------------------------------

3. Loop runs until
   number becomes 0.

*/
