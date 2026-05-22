package conditionals;

// ============================================================
// Switch Statement in Java
// ============================================================

/*

Switch Statement is used
to execute one block of code
from multiple options.

It is an alternative
to multiple if-else statements.

*/


public class SwitchStatement {

    public static void main(String[] args) {

        // Declaring Variable
        int number = 2;



        // ============================================================
        // Switch Statement
        // ============================================================

        switch (number) {

            case 1:

                System.out.println("One");

                break;

            case 2:

                System.out.println("Two");

                break;

            case 3:

                System.out.println("Three");

                break;

            default:

                System.out.println("Invalid Number");

        }

    }
}



/*

Output:

Two

*/


// ============================================================
// Explanation
// ============================================================

/*

1. switch checks value of variable.

--------------------------------------------------

2. case defines different options.

--------------------------------------------------

3. Matching case executes.

--------------------------------------------------

4. break stops execution
   after matching case.

--------------------------------------------------

5. default executes when
   no case matches.

*/
