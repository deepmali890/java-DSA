package patterns;

// ============================================================
// Star Pattern in Java
// ============================================================

/*

In this program,
we print star pattern
using nested loops.

Pattern:

*
**
***
****

*/


public class PrintStarPattern {

    public static void main(String[] args) {



        // ============================================================
        // Outer Loop
        // ============================================================

        /*
           Outer loop controls
           number of lines.
        */

        for (int line = 1; line <= 4; line++) {



            // ========================================================
            // Inner Loop
            // ========================================================

            /*
               Inner loop controls
               number of stars.
            */

            for (int star = 1; star <= line; star++) {

                System.out.print("*");

            }



            // ========================================================
            // Moving to Next Line
            // ========================================================

            System.out.println();

        }

    }
}



/*

Output:

*
**
***
****

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Outer Loop

   Controls number of rows.

--------------------------------------------------

2. Inner Loop

   Controls number of stars.

--------------------------------------------------

3. line variable

   Represents current row.

--------------------------------------------------

4. star variable

   Represents number of stars.

--------------------------------------------------

5. System.out.print()

   Prints stars in same line.

--------------------------------------------------

6. System.out.println()

   Moves cursor to next line.

*/
