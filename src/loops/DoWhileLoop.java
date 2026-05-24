package loops;

// ============================================================
// Do-While Loop in Java
// ============================================================

/*

do-while loop executes
a block of code
at least one time,
even if condition is false.

Syntax:

do{

    // code

}while(condition);

*/


public class DoWhileLoop {

    public static void main(String[] args) {

        // Declaring Variable
        int counter = 1;



        // ============================================================
        // do-while Loop
        // ============================================================

        /*
           Loop prints numbers
           from 1 to 10.
        */

        do {

            System.out.println(counter);

            counter++;

        } while (counter <= 10);

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

*/


// ============================================================
// Explanation
// ============================================================

/*

1. do block executes first.

--------------------------------------------------

2. Condition checks after execution.

--------------------------------------------------

3. counter++

   Increases value by 1.

--------------------------------------------------

4. Loop runs until
   condition becomes false.

--------------------------------------------------

5. do-while loop executes
   at least one time.

*/
