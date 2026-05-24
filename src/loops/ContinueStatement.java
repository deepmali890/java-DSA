package loops;

// ============================================================
// Continue Statement in Java
// ============================================================

/*

continue statement is used
to skip current iteration
of loop.

After continue,
loop directly moves
to next iteration.

*/


public class ContinueStatement {

    public static void main(String[] args) {



        // ============================================================
        // for Loop with continue
        // ============================================================

        for (int i = 1; i <= 5; i++) {

            /*
               Skip iteration
               when i becomes 3.
            */

            if (i == 3) {

                continue;

            }

            System.out.println(i);

        }

    }
}



/*

Output:

1
2
4
5

*/


// ============================================================
// Explanation
// ============================================================

/*

1. continue statement
   skips current iteration.

--------------------------------------------------

2. if(i == 3)

   checks condition.

--------------------------------------------------

3. When condition becomes true,
   remaining code inside loop
   gets skipped.

--------------------------------------------------

4. Loop continues
   with next iteration.

--------------------------------------------------

5. Number 3 does not print.

*/
