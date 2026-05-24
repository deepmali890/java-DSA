package patterns;

// ============================================================
// Inverted Star Pattern in Java
// ============================================================

/*

In this program,
we print inverted star pattern
using nested loops.

Pattern:
*****
****
***
**
*

*/


public class InvertedStarPattern {

    public static void main(String[] args) {

        // Declaring Variable
        int n = 4;



        // ============================================================
        // Outer Loop
        // ============================================================

        /*
           Outer loop controls
           number of rows.
        */

        for (int line = 1; line <= n; line++) {



            // ========================================================
            // Inner Loop
            // ========================================================

            /*
               Inner loop controls
               number of stars.

               Formula:

               n - line + 1
            */

            for (int star = 1; star <= n - line + 1; star++) {

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

*****
****
***
**
*

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Outer Loop

   Controls rows.

--------------------------------------------------

2. Inner Loop

   Controls stars.

--------------------------------------------------

3. Formula:

   n - line + 1

   decreases stars in each row.

--------------------------------------------------

4. First row prints maximum stars.

--------------------------------------------------

5. Last row prints only one star.

--------------------------------------------------

6. Nested loops are used
   for pattern printing.

*/
