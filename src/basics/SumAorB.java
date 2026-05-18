package basics;

import java.util.Scanner;

// ============================================================
// 10. Sum of Two Numbers Using User Input
// ============================================================

/*

In this program, we take two numbers
from the user using Scanner class
and then calculate their sum.

*/

public class SumAorB {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);


        // ============================================================
        // Taking Input from User
        // ============================================================

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();


        // ============================================================
        // Adding Both Numbers
        // ============================================================

        int sum = a + b;


        // ============================================================
        // Printing Result
        // ============================================================

        System.out.println("Sum of Two Numbers: " + sum);


        // Closing Scanner
        sc.close();

    }
}



/*

Example Input:

10
20


Output:

Sum of Two Numbers: 30

*/



// ============================================================
// Explanation
// ============================================================

/*

1. Scanner is used to take input from the user.

2. nextInt() reads integer values.

3. The + operator is used for addition.

4. The result is stored inside the sum variable.

5. System.out.println() prints the final output.

*/
