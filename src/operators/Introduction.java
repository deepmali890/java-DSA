package operators;

// ============================================================
// Introduction to Operators in Java
// ============================================================

/*

Operators are special symbols
that tell the compiler to perform
specific operations.

Example:

a + b

Here:
+ is an operator used for addition.

*/


public class Introduction {

    public static void main(String[] args) {

        // Declaring Variables
        int a = 10;
        int b = 5;


        // ============================================================
        // Addition Operation
        // ============================================================

        int sum = a + b;

        System.out.println("Sum: " + sum);

    }
}



/*

Output:

Sum: 15

*/


// ============================================================
// Types of Operators in Java
// ============================================================

/*

1. Arithmetic Operators
   - Used for mathematical operations

   Example:
   +  -  *  /  %

--------------------------------------------------

2. Relational Operators
   - Used for comparison

   Example:
   ==  !=  >  <  >=  <=

--------------------------------------------------

3. Logical Operators
   - Used for logical conditions

   Example:
   &&  ||  !

--------------------------------------------------

4. Bitwise Operators
   - Used for bit-level operations

   Example:
   &  |  ^  ~  <<  >>

--------------------------------------------------

5. Assignment Operators
   - Used to assign values

   Example:
   =  +=  -=  *=  /=

--------------------------------------------------

6. Ternary Operator
   - Shortcut form of if-else

   Example:
   condition ? true : false

*/
