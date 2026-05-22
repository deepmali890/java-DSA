package conditionals;

// ============================================================
// Pass or Fail Program in Java
// ============================================================

/*

In this program,
we check whether a student
is Pass or Fail using Ternary Operator.

Passing Marks:

33 or greater

*/


public class PassOrFail {

    public static void main(String[] args) {

        // Declaring Variable
        int marks = 33;



        // ============================================================
        // Checking Pass or Fail
        // ============================================================

        /*
           If marks are greater than
           or equal to 33:

           Student is Pass

           Otherwise:

           Student is Fail
        */

        String reportCard = (marks >= 33) ? "Pass" : "Fail";



        // ============================================================
        // Printing Result
        // ============================================================

        System.out.println(reportCard);

    }
}



/*

Output:

Pass

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Ternary Operator is used
   as short form of if-else.

--------------------------------------------------

2. Condition:

   marks >= 33

--------------------------------------------------

3. If condition is true:
   "Pass" gets selected.

--------------------------------------------------

4. If condition is false:
   "Fail" gets selected.

--------------------------------------------------

5. >= means:

   Greater Than or Equal To

*/
