package loops;

// ============================================================
// While Loop in Java
// ============================================================

/*

while loop is used
to execute a block of code
repeatedly until
the condition becomes false.

Syntax:

while(condition){

    // code

}

*/


public class WhileLoop {

    public static void main(String[] args) {

        // Declaring Variable
        int counter = 0;



        // ============================================================
        // while Loop
        // ============================================================

        /*
           Loop will execute
           until counter becomes 10.
        */

        while (counter < 10) {

            System.out.println("Hello World");

            counter++;

        }



        // ============================================================
        // Final Statement
        // ============================================================

        System.out.println("Hello World Printed 10 Times");

    }
}



/*

Output:

Hello World
Hello World
Hello World
Hello World
Hello World
Hello World
Hello World
Hello World
Hello World
Hello World

Hello World Printed 10 Times

*/


// ============================================================
// Explanation
// ============================================================

/*

1. while loop checks condition first.

--------------------------------------------------

2. If condition is true:
   loop executes.

--------------------------------------------------

3. counter++
   increases value by 1.

--------------------------------------------------

4. Loop stops when
   condition becomes false.

--------------------------------------------------

5. Infinite Loop

   If condition never becomes false,
   loop runs forever.

*/
