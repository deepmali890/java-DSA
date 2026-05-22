package operators;

// ============================================================
// Assignment Operators in Java
// ============================================================

/*

Assignment Operators are used
to assign or update values in variables.

These operators make code shorter
and more readable.

Operators:

=   -> Assign
+=  -> Add and Assign
-=  -> Subtract and Assign
*=  -> Multiply and Assign
/=  -> Divide and Assign
%=  -> Modulus and Assign

*/


public class AssignmentOperators {

    public static void main(String[] args) {

        // Declaring Variables
        int A = 10;
        int B = 10;



        // ============================================================
        // = Operator
        // ============================================================

        /*
           Assigns value to variable
        */

        int number = 5;

        System.out.println("Assignment Value: " + number);



        // ============================================================
        // += Operator
        // ============================================================

        /*
           A += 10

           Same as:
           A = A + 10
        */

        A += 10;

        System.out.println("After += : " + A);



        // ============================================================
        // -= Operator
        // ============================================================

        /*
           B -= 5

           Same as:
           B = B - 5
        */

        B -= 5;

        System.out.println("After -= : " + B);



        // ============================================================
        // *= Operator
        // ============================================================

        /*
           A *= 10

           Same as:
           A = A * 10
        */

        A *= 10;

        System.out.println("After *= : " + A);



        // ============================================================
        // /= Operator
        // ============================================================

        /*
           B /= 5

           Same as:
           B = B / 5
        */

        B /= 5;

        System.out.println("After /= : " + B);



        // ============================================================
        // %= Operator
        // ============================================================

        /*
           Gives remainder after division
        */

        A %= 3;

        System.out.println("After %= : " + A);

    }
}



/*

Output:

Assignment Value: 5

After += : 20
After -= : 5
After *= : 200
After /= : 1
After %= : 2

*/


// ============================================================
// Explanation
// ============================================================

/*

1. = Operator
   Assigns value to variable.

--------------------------------------------------

2. += Operator
   Adds value and stores result.

--------------------------------------------------

3. -= Operator
   Subtracts value and stores result.

--------------------------------------------------

4. *= Operator
   Multiplies value and stores result.

--------------------------------------------------

5. /= Operator
   Divides value and stores result.

--------------------------------------------------

6. %= Operator
   Stores remainder after division.

*/
