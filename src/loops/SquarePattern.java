package loops;

// ============================================================
// Square Pattern in Java
// ============================================================

/*

In this program,
we print a square pattern
using for loop.

Pattern:

****
****
****
****

*/


public class SquarePattern {

    public static void main(String[] args) {



        // ============================================================
        // for Loop
        // ============================================================

        /*
           Loop runs 4 times
           and prints stars pattern.
        */

        for (int line = 1; line <= 4; line++) {

            System.out.println("****");

        }

    }
}



/*

Output:

****
****
****
****

*/


// ============================================================
// Explanation
// ============================================================

/*

1. line variable
   controls number of rows.

--------------------------------------------------

2. for loop runs 4 times.

--------------------------------------------------

3. System.out.println("****")

   prints stars in each line.

--------------------------------------------------

4. Each loop iteration
   prints one row.

*/
