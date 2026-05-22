package conditionals;

// ============================================================
// Else-If Statement in Java
// ============================================================

/*

Else-if statement is used
to check multiple conditions.

Java checks conditions
from top to bottom.

The first true condition executes.

*/


public class ElseIfStatement {

    public static void main(String[] args) {

        // Declaring Variable
        int age = 13;



        // ============================================================
        // Checking Age Conditions
        // ============================================================

        if (age >= 18) {

            System.out.println("You are eligible to earn money.");

        } else if (age > 13 && age < 18) {

            System.out.println("You are a Teenager.");

        } else {

            System.out.println("You are not eligible to earn money.");

        }

    }
}



/*

Output:

You are not eligible to earn money.

*/


// ============================================================
// Explanation
// ============================================================

/*

1. if condition
   Checks first condition.

--------------------------------------------------

2. else-if condition
   Runs when first condition is false.

--------------------------------------------------

3. else block
   Runs when all conditions are false.

--------------------------------------------------

4. Java executes
   only one matching block.

--------------------------------------------------

5. && means Logical AND.

   Both conditions must be true.

*/
