package operators;

// ============================================================
// Relational Operators in Java
// ============================================================

/*

Relational Operators are used
to compare two values.

The result of relational operators
is always:

true
or
false

(Relational Operators return boolean values)

*/


public class RelationalOperators {

    public static void main(String[] args) {

        // Declaring Variables
        int A = 10;
        int B = 5;
        int C = 10;


        // ============================================================
        // Equal To (==)
        // ============================================================

        System.out.println("A == B : " + (A == B));

        System.out.println("A == C : " + (A == C));



        // ============================================================
        // Not Equal To (!=)
        // ============================================================

        System.out.println("A != C : " + (A != C));

        System.out.println("A != B : " + (A != B));



        // ============================================================
        // Greater Than (>)
        // ============================================================

        System.out.println("A > B : " + (A > B));

        System.out.println("A > C : " + (A > C));



        // ============================================================
        // Less Than (<)
        // ============================================================

        System.out.println("A < B : " + (A < B));

        System.out.println("B < A : " + (B < A));



        // ============================================================
        // Greater Than or Equal To (>=)
        // ============================================================

        System.out.println("A >= B : " + (A >= B));

        System.out.println("A >= C : " + (A >= C));



        // ============================================================
        // Less Than or Equal To (<=)
        // ============================================================

        System.out.println("A <= B : " + (A <= B));

        System.out.println("A <= C : " + (A <= C));

    }
}



/*

Output:

A == B : false
A == C : true

A != C : false
A != B : true

A > B : true
A > C : false

A < B : false
B < A : true

A >= B : true
A >= C : true

A <= B : false
A <= C : true

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Equal To (==)
   Checks whether two values are equal or not.

   Example:
   10 == 10 -> true

--------------------------------------------------

2. Not Equal To (!=)
   Checks whether two values are different.

   Example:
   10 != 5 -> true

--------------------------------------------------

3. Greater Than (>)
   Checks whether left value is greater.

   Example:
   10 > 5 -> true

--------------------------------------------------

4. Less Than (<)
   Checks whether left value is smaller.

   Example:
   5 < 10 -> true

--------------------------------------------------

5. Greater Than or Equal To (>=)
   Checks whether value is greater
   or equal.

   Example:
   10 >= 10 -> true

--------------------------------------------------

6. Less Than or Equal To (<=)
   Checks whether value is smaller
   or equal.

   Example:
   10 <= 10 -> true

--------------------------------------------------

Important Point

Relational Operators always return:

true
or
false

These are boolean values.

*/
