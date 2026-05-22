package conditionals;

// ============================================================
// Largest of Two Numbers in Java
// ============================================================

/*

In this program,
we compare two numbers
and find the largest number using if-else statement.

*/


public class LargestOfTwoNumbers {

    public static void main(String[] args) {

        // Declaring Variables
        int A = 1;
        int B = 2;



        // ============================================================
        // Checking Largest Number
        // ============================================================

        if (A >= B) {

            System.out.println("The Largest Number is A");

        } else {

            System.out.println("The Largest Number is B");

        }

    }
}



/*

Output:

The Largest Number is B

*/


// ============================================================
// Explanation
// ============================================================

/*

1. if condition checks whether:

   A is greater than or equal to B

--------------------------------------------------

2. If condition becomes true:

   Largest number is A

--------------------------------------------------

3. Otherwise:

   Largest number is B

--------------------------------------------------

4. >= means:

   Greater Than or Equal To

*/
