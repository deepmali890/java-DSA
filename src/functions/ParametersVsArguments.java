package functions;

// ============================================================
// Parameters vs Arguments in Java
// ============================================================

/*

Parameters and Arguments
are used in functions
to pass values.

--------------------------------------------------

Parameters

Variables written
inside function definition.

--------------------------------------------------

Arguments

Actual values passed
during function call.

*/


public class ParametersVsArguments {



    // ============================================================
    // Function Definition
    // ============================================================

    /*
       num1 and num2
       are Parameters.
    */

    public static void printSum(int num1, int num2) {

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

    }



    // ============================================================
    // Main Method
    // ============================================================

    public static void main(String[] args) {



        // ========================================================
        // Function Call
        // ========================================================

        /*
           10 and 20
           are Arguments.
        */

        printSum(10, 20);

    }
}



/*

Output:

Sum = 30

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Parameters

   Variables inside function definition.

   Example:

   int num1, int num2

--------------------------------------------------

2. Arguments

   Actual values passed
   during function call.

   Example:

   printSum(10, 20);

--------------------------------------------------

3. Parameters receive values
   from arguments.

--------------------------------------------------

4. Functions become reusable
   using parameters and arguments.

*/
