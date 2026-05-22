package conditionals;

// ============================================================
// Ternary Operator in Java
// ============================================================

/*

Ternary Operator is a short form
of if-else statement.

Syntax:

condition ? true statement : false statement;

*/


public class TernaryOperator {

    public static void main(String[] args) {

        // Declaring Variable
        int number = 4;



        // ============================================================
        // Checking Odd or Even
        // ============================================================

        /*
           If condition is true:
           "Even" will store in type

           Otherwise:
           "Odd" will store in type
        */

        String type = ((number % 2) == 0) ? "Even" : "Odd";



        // ============================================================
        // Printing Result
        // ============================================================

        System.out.println(type);

    }
}



/*

Output:

Even

*/


// ============================================================
// Explanation
// ============================================================

/*

1. % is Modulus Operator.

--------------------------------------------------

2. number % 2 == 0

   Checks whether number
   is divisible by 2.

--------------------------------------------------

3. Ternary Operator works like:

   condition ? true : false

--------------------------------------------------

4. If condition is true:
   "Even" gets selected.

--------------------------------------------------

5. If condition is false:
   "Odd" gets selected.

*/
