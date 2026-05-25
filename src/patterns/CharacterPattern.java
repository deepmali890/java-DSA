package patterns;

// ============================================================
// Character Pattern in Java
// ============================================================

/*

In this program,
we print character pattern
using nested loops.

Pattern:

A
BC
DEF
GHIJ

*/


public class CharacterPattern {

    public static void main(String[] args) {

        // Declaring Variables
        int n = 4;

        char ch = 'A';



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
               Inner loop prints
               characters in each row.
            */

            for (int chars = 1; chars <= line; chars++) {

                System.out.print(ch);

                ch++;

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

A
BC
DEF
GHIJ

*/


// ============================================================
// Explanation
// ============================================================

/*

1. char ch = 'A'

   Starts character from A.

--------------------------------------------------

2. Outer Loop

   Controls rows.

--------------------------------------------------

3. Inner Loop

   Controls characters.

--------------------------------------------------

4. ch++

   Moves to next character.

   Example:

   A -> B -> C

--------------------------------------------------

5. Nested loops are used
   for pattern printing.

*/
