package conditionals;

// ============================================================
// If-Else Statement in Java
// ============================================================

/*

Conditional Statements are used
to make decisions in Java.

if-else checks conditions
and executes code based on true or false result.

*/


public class IfElse {

    public static void main(String[] args) {

        // Declaring Variable
        int age = 16;



        // ============================================================
        // Simple if Statement
        // ============================================================

        /*
           if statement executes
           only when condition is true.
        */

        if (age >= 18) {

            System.out.println("Adult");

        }



        // ============================================================
        // if-else Statement
        // ============================================================

        /*
           if block runs when condition is true.

           else block runs when condition is false.
        */

        if (age >= 18) {

            System.out.println("Not Child");

        } else {

            System.out.println("Child");

        }



        // ============================================================
        // Multiple Conditions
        // ============================================================

        /*
           Checking whether person is:

           Adult
           Teenager
           or Child
        */

        if (age >= 18) {

            System.out.println("Not Child");

        } else if (age > 13 && age < 18) {

            System.out.println("Teenager");

        } else {

            System.out.println("Child");

        }

    }
}



/*

Output:

Child
Teenager

*/


// ============================================================
// Explanation
// ============================================================

/*

1. if Statement
   Runs only when condition is true.

--------------------------------------------------

2. if-else Statement
   if runs for true condition.
   else runs for false condition.

--------------------------------------------------

3. else-if Statement
   Used to check multiple conditions.

--------------------------------------------------

4. Logical AND (&&)
   Returns true only when
   both conditions are true.

*/
