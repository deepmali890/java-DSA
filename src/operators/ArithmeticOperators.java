package operators;

// ============================================================
// Arithmetic Operators in Java
// ============================================================

/*

Arithmetic Operators are used
to perform mathematical operations.

There are mainly 2 types:

1. Binary Operators
2. Unary Operators

*/


public class ArithmeticOperators {

    public static void main(String[] args) {

        // Declaring Variables
        int A = 10;
        int B = 5;


        // ============================================================
        // Binary Arithmetic Operators
        // ============================================================

        /*
           Binary Operators work on two operands.

           Example:
           A + B
        */


        // Addition
        System.out.println("Addition: " + (A + B));


        // Subtraction
        System.out.println("Subtraction: " + (A - B));


        // Multiplication
        System.out.println("Multiplication: " + (A * B));


        // Division
        System.out.println("Division: " + (A / B));


        // Modulus
        System.out.println("Modulus: " + (A % B));



        // ============================================================
        // Unary Operators
        // ============================================================

        /*
           Unary Operators work on only one operand.

           Types:
           1. Increment Operator (++)
           2. Decrement Operator (--)
        */


        // ============================================================
        // Increment Operator
        // ============================================================

        int number = 10;

        System.out.println("Original Value: " + number);

        number++;

        System.out.println("After Increment: " + number);



        // ============================================================
        // Decrement Operator
        // ============================================================

        int value = 20;

        System.out.println("Original Value: " + value);

        value--;

        System.out.println("After Decrement: " + value);



        // ============================================================
        // Pre Increment
        // ============================================================

        int a = 5;

        int preIncrement = ++a;

        System.out.println("Pre Increment Value: " + preIncrement);

        System.out.println("Updated a Value: " + a);



        // ============================================================
        // Post Increment
        // ============================================================

        int b = 5;

        int postIncrement = b++;

        System.out.println("Post Increment Value: " + postIncrement);

        System.out.println("Updated b Value: " + b);



        // ============================================================
        // Pre Decrement
        // ============================================================

        int c = 5;

        int preDecrement = --c;

        System.out.println("Pre Decrement Value: " + preDecrement);

        System.out.println("Updated c Value: " + c);



        // ============================================================
        // Post Decrement
        // ============================================================

        int d = 5;

        int postDecrement = d--;

        System.out.println("Post Decrement Value: " + postDecrement);

        System.out.println("Updated d Value: " + d);

    }
}



/*

Output:

Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Modulus: 0

Original Value: 10
After Increment: 11

Original Value: 20
After Decrement: 19

Pre Increment Value: 6
Updated a Value: 6

Post Increment Value: 5
Updated b Value: 6

Pre Decrement Value: 4
Updated c Value: 4

Post Decrement Value: 5
Updated d Value: 4

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Binary Operators
   - Work on two operands

   Example:
   A + B

--------------------------------------------------

2. Unary Operators
   - Work on single operand

   Example:
   A++

--------------------------------------------------

3. Increment Operator (++)

   Increases value by 1

   Example:
   5 becomes 6

--------------------------------------------------

4. Decrement Operator (--)

   Decreases value by 1

   Example:
   5 becomes 4

--------------------------------------------------

5. Pre Increment (++A)

   First increases value,
   then uses it.

--------------------------------------------------

6. Post Increment (A++)

   First uses value,
   then increases it.

--------------------------------------------------

7. Pre Decrement (--A)

   First decreases value,
   then uses it.

--------------------------------------------------

8. Post Decrement (A--)

   First uses value,
   then decreases it.

*/
