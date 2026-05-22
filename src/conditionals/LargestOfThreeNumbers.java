package conditionals;

// ============================================================
// Largest of Three Numbers in Java
// ============================================================

/*

In this program,
we compare three numbers
and find the largest number
using if-else-if statement.

*/


public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        // Declaring Variables
        int A = 1;
        int B = 3;
        int C = 4;



        // ============================================================
        // Checking Largest Number
        // ============================================================

        if (A >= B && A >= C) {

            System.out.println("The Largest Number is A");

        } else if (B >= C) {

            System.out.println("The Largest Number is B");

        } else {

            System.out.println("The Largest Number is C");

        }

    }
}



/*

Output:

The Largest Number is C

*/


// ============================================================
// Explanation
// ============================================================

/*

1. First condition checks:

   A >= B && A >= C

   If true,
   A is largest.

--------------------------------------------------

2. Second condition checks:

   B >= C

   If true,
   B is largest.

--------------------------------------------------

3. Otherwise:

   C is largest.

--------------------------------------------------

4. && means Logical AND.

   Both conditions must be true.

*/
