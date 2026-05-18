package basics;

import java.util.Scanner;

// ============================================================
// 11. Area of Circle in Java
// ============================================================

/*

In this program, we take the radius
of a circle from the user
and calculate its area.

Formula:

Area = π × r × r

Where:
π = 3.14
r = radius

*/

public class AreaOfCircle {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);


        // ============================================================
        // Taking Radius Input
        // ============================================================

        System.out.print("Enter Radius of Circle: ");
        float radius = sc.nextFloat();


        // ============================================================
        // Calculating Area
        // ============================================================

        float area = 3.14f * radius * radius;


        // ============================================================
        // Printing Result
        // ============================================================

        System.out.println("Area of Circle: " + area);


        // Closing Scanner
        sc.close();

    }
}



/*

Example Input:

5


Output:

Area of Circle: 78.5

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Scanner is used to take input from the user.

2. radius variable stores the radius of the circle.

3. Formula used:

   Area = 3.14 × radius × radius

4. The calculated result is stored
   inside the area variable.

5. System.out.println() is used
   to print the final output.

*/
