package loops;

// ============================================================
// Print Numbers from 1 to 10 using while Loop
// ============================================================

/*

In this program,
we print numbers
from 1 to 10
using while loop.

*/


public class PrintNumbersOneToTen {

    public static void main(String[] args) {

        // Declaring Variable
        int counter = 1;



        // ============================================================
        // while Loop
        // ============================================================

        /*
           Loop will execute
           until counter becomes 10.
        */

        while (counter <= 10) {

            System.out.print(counter + " ");

            counter++;

        }

    }
}



/*

Output:

1 2 3 4 5 6 7 8 9 10

*/


// ============================================================
// Explanation
// ============================================================

/*

1. counter starts from 1.

--------------------------------------------------

2. while(counter <= 10)

   Loop runs until
   counter becomes greater than 10.

--------------------------------------------------

3. System.out.print()

   Prints output
   in same line.

--------------------------------------------------

4. counter++

   Increases value by 1.

*/
