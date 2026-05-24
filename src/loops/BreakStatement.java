package loops;

// ============================================================
// Break Statement in Java
// ============================================================

/*

break statement is used
to immediately stop the loop.

When break executes,
loop terminates instantly.

*/


public class BreakStatement {

    public static void main(String[] args) {



        // ============================================================
        // for Loop with break
        // ============================================================

        for (int i = 1; i <= 5; i++) {

            /*
               Loop stops
               when i becomes 3.
            */

            if (i == 3) {

                break;

            }

            System.out.println(i);

        }



        // ============================================================
        // Final Statement
        // ============================================================

        System.out.println("Break Statement Executed");

    }
}



/*

Output:

1
2
Break Statement Executed

*/


// ============================================================
// Explanation
// ============================================================

/*

1. break statement
   immediately stops loop.

--------------------------------------------------

2. if(i == 3)

   checks condition.

--------------------------------------------------

3. When condition becomes true,
   loop terminates.

--------------------------------------------------

4. Statements after break
   do not execute inside loop.

*/
