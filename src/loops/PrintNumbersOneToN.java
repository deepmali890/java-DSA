package loops;

import java.util.Scanner;

// ============================================================
// Print Numbers from 1 to N using while Loop
// ============================================================

/*

In this program,
user enters a range (N)
and program prints numbers
from 1 to N.

*/


public class PrintNumbersOneToN {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);



        // ============================================================
        // Taking Input
        // ============================================================

        System.out.print("Enter Range: ");

        int range = sc.nextInt();



        // ============================================================
        // Declaring Counter Variable
        // ============================================================

        int counter = 1;



        // ============================================================
        // while Loop
        // ============================================================

        /*
           Loop runs until
           counter becomes greater than range.
        */

        while (counter <= range) {

            System.out.println(counter);

            counter++;

        }



        // Closing Scanner
        sc.close();

    }
}



/*

Example

Input:
5

Output:

1
2
3
4
5

*/


// ============================================================
// Explanation
// ============================================================

/*

1. User enters range value.

--------------------------------------------------

2. counter starts from 1.

--------------------------------------------------

3. while(counter <= range)

   Loop runs until
   counter becomes greater than range.

--------------------------------------------------

4. counter++

   Increases value by 1.

--------------------------------------------------

5. Numbers print from 1 to N.

*/
