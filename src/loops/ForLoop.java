package loops;

// ============================================================
// For Loop in Java
// ============================================================

/*

for loop is used
when number of repetitions
is already known.

Syntax:

for(initialization; condition; update){

    // code

}

*/


public class ForLoop {

    public static void main(String[] args) {



        // ============================================================
        // Printing Numbers from 1 to 10
        // ============================================================

        /*
           i starts from 1
           and increases until 10.
        */

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

        }



        // ============================================================
        // Printing Numbers from 10 to 1
        // ============================================================

        /*
           r starts from 10
           and decreases until 1.
        */

        for (int r = 10; r >= 1; r--) {

            System.out.println(r);

        }

    }
}



/*

Output:

1
2
3
4
5
6
7
8
9
10

10
9
8
7
6
5
4
3
2
1

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Initialization

   Starting value of loop variable.

   Example:
   int i = 1

--------------------------------------------------

2. Condition

   Loop runs until
   condition becomes false.

   Example:
   i <= 10

--------------------------------------------------

3. Update

   Changes loop variable value.

   Example:
   i++
   r--

--------------------------------------------------

4. i++

   Increases value by 1.

--------------------------------------------------

5. r--

   Decreases value by 1.

*/
