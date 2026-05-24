package loops;

// ============================================================
// Reverse Complete Number in Java
// ============================================================

/*

In this program,
we reverse a complete number.

Example:

12345

Reverse:

54321

*/


public class ReverseGivenNumber {

    public static void main(String[] args) {

        // Declaring Variables
        int number = 12345;

        int reverse = 0;



        // ============================================================
        // while Loop
        // ============================================================

        /*
           Logic:

           reverse = reverse * 10 + lastDigit
        */

        while (number > 0) {

            int lastDigit = number % 10;

            reverse = reverse * 10 + lastDigit;

            number = number / 10;

        }



        // ============================================================
        // Printing Reverse Number
        // ============================================================

        System.out.println("Reverse Number: " + reverse);

    }
}



/*

Output:

Reverse Number: 54321

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

3. reverse * 10

   Shifts digits to left side.

--------------------------------------------------

4. reverse + lastDigit

   Adds new digit to reverse number.

--------------------------------------------------

5. Loop runs until
   number becomes 0.

*/
