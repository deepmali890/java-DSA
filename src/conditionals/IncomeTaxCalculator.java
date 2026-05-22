package conditionals;

import java.util.Scanner;

// ============================================================
// Income Tax Calculator in Java
// ============================================================

/*

In this program,
we calculate income tax
based on yearly income.

Tax Rules:

1. Income less than 5 Lakhs
   -> No Tax

2. Income between 5 Lakhs and 10 Lakhs
   -> 20% Tax

3. Income greater than 10 Lakhs
   -> 30% Tax

*/


public class IncomeTaxCalculator {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Taking Income Input
        // ============================================================

        System.out.print("Enter Your Income: ");

        int income = sc.nextInt();

        int tax;



        // ============================================================
        // Calculating Tax
        // ============================================================

        if (income < 500000) {

            tax = 0;

        } else if (income >= 500000 && income < 1000000) {

            tax = (int) (income * 0.2);

        } else {

            tax = (int) (income * 0.3);

        }



        // ============================================================
        // Printing Tax
        // ============================================================

        System.out.println("Your Tax Amount is: " + tax);



        // Closing Scanner
        sc.close();

    }
}



/*

Example 1

Input:
400000

Output:
0

--------------------------------------------------

Example 2

Input:
600000

Output:
120000

--------------------------------------------------

Example 3

Input:
1200000

Output:
360000

*/


// ============================================================
// Explanation
// ============================================================

/*

1. if condition
   Checks income less than 5 Lakhs.

--------------------------------------------------

2. else-if condition
   Checks income between
   5 Lakhs and 10 Lakhs.

--------------------------------------------------

3. else condition
   Runs when income is
   greater than 10 Lakhs.

--------------------------------------------------

4. Type Casting is used:

   (int)

   because:

   income * 0.2
   gives double value.

*/
