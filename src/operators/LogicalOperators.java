package operators;

// ============================================================
// Logical Operators in Java
// ============================================================

/*

Logical Operators are used
to combine multiple conditions.

Logical Operators always return:

true
or
false

Types of Logical Operators:

&&  -> Logical AND
||  -> Logical OR
!   -> Logical NOT

*/


public class LogicalOperators {

    public static void main(String[] args) {



        // ============================================================
        // Logical AND (&&)
        // ============================================================

        /*
           Returns true only when
           both conditions are true.
        */

        System.out.println((3 > 4) && (5 > 6));

        System.out.println((6 > 4) && (8 > 6));



        // ============================================================
        // Logical OR (||)
        // ============================================================

        /*
           Returns true if at least
           one condition is true.
        */

        System.out.println((8 > 4) || (9 > 6));

        System.out.println((3 > 4) || (7 > 6));

        System.out.println((8 > 4) || (6 > 6));

        System.out.println((2 > 4) || (4 > 6));



        // ============================================================
        // Logical NOT (!)
        // ============================================================

        /*
           Reverses the result.

           true  -> false
           false -> true
        */

        System.out.println(!(2 > 4));

        System.out.println(!(4 > 2));

        System.out.println(!(true));

        System.out.println(!(false));

    }

}



/*

Output:

false
true

true
true
true
false

true
false
false
true

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Logical AND (&&)

   Returns true only if
   both conditions are true.

   Example:
   true && true -> true

--------------------------------------------------

2. Logical OR (||)

   Returns true if at least
   one condition is true.

   Example:
   true || false -> true

--------------------------------------------------

3. Logical NOT (!)

   Reverses the result.

   Example:
   !true -> false
   !false -> true

--------------------------------------------------

Important Point

Logical Operators are mostly used
in conditions and decision making.

*/
