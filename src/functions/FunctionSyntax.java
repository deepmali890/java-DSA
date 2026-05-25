package functions;

// ============================================================
// Function Syntax in Java
// ============================================================

/*

Function is a block of code
that performs a specific task.

Functions help us:

1. Reuse code
2. Reduce code duplication
3. Make code clean and readable

*/


public class FunctionSyntax {



    // ============================================================
    // Function Definition
    // ============================================================

    /*
       Syntax:

       returnType functionName(){

           // code

       }

    */

    public static void printHello() {

        System.out.println("Hello World");

    }



    // ============================================================
    // Main Method
    // ============================================================

    public static void main(String[] args) {



        // ========================================================
        // Function Call
        // ========================================================

        printHello();

    }
}



/*

Output:

Hello World

*/


// ============================================================
// Explanation
// ============================================================

/*

1. public

   Access Modifier.

--------------------------------------------------

2. static

   Allows method to call directly
   without creating object.

--------------------------------------------------

3. void

   Means function returns nothing.

--------------------------------------------------

4. printHello()

   Function Name.

--------------------------------------------------

5. Function Call

   printHello();

   Executes function code.

--------------------------------------------------

6. Functions improve
   code reusability.

*/
