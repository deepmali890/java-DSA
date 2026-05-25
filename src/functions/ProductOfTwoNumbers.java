package functions;

// ============================================================
// Product of Two Numbers in Java
// ============================================================

/*

In this program,
we create a function
to calculate product
of two numbers.

*/


public class ProductOfTwoNumbers {



    // ============================================================
    // Function Definition
    // ============================================================

    /*
       This function takes
       two numbers as parameters
       and returns their product.
    */

    public static int multiply(int a, int b) {

        int product = a * b;

        return product;

    }



    // ============================================================
    // Main Method
    // ============================================================

    public static void main(String[] args) {



        // ========================================================
        // Declaring Variables
        // ========================================================

        int a = 10;

        int b = 20;



        // ========================================================
        // Function Call
        // ========================================================

        int product = multiply(a, b);

        System.out.println("Product = " + product);



        // ========================================================
        // Calling Function Again
        // ========================================================

        product = multiply(20, 30);

        System.out.println("Product = " + product);

    }
}



/*

Output:

Product = 200
Product = 600

*/


// ============================================================
// Explanation
// ============================================================

/*

1. int multiply()

   Function returns integer value.

--------------------------------------------------

2. return product;

   Sends value back to caller.

--------------------------------------------------

3. a and b

   are parameters.

--------------------------------------------------

4. multiply(a, b)

   is function call.

--------------------------------------------------

5. Functions can be reused
   multiple times.

--------------------------------------------------

6. Product Formula

   a * b

*/
