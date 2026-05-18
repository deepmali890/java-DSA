package basics;

import java.util.Scanner;

// ============================================================
// 9. Input in Java
// ============================================================

/*

In Java, we use the Scanner class
to take input from the user.

Scanner is present inside:

java.util package

So we import it using:

import java.util.Scanner;

*/


public class InputInJava {

    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);


        // ============================================================
        // 1. Taking Single Word Input
        // ============================================================

        /*
           next() is used to take only a single word input.

           It stops reading when space comes.
        */

        System.out.print("Enter Your First Name: ");
        String firstName = sc.next();

        System.out.println("First Name: " + firstName);



        // ============================================================
        // 2. Taking Full Line Input
        // ============================================================

        /*
           nextLine() is used to take complete line input.

           It also accepts spaces.
        */

        sc.nextLine(); // clears leftover buffer

        System.out.print("Enter Your Full Name: ");
        String fullName = sc.nextLine();

        System.out.println("Full Name: " + fullName);



        // ============================================================
        // 3. Taking Integer Input
        // ============================================================

        /*
           nextInt() is used to take integer values.
        */

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);



        // ============================================================
        // 4. Taking Float Input
        // ============================================================

        /*
           nextFloat() is used to take floating point values.
        */

        System.out.print("Enter Your Percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("Percentage: " + percentage);



        // ============================================================
        // 5. Taking Double Input
        // ============================================================

        /*
           nextDouble() is used for large decimal values.
        */

        System.out.print("Enter Your Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Salary: " + salary);



        // ============================================================
        // 6. Taking Boolean Input
        // ============================================================

        /*
           nextBoolean() accepts:
           true or false
        */

        System.out.print("Are You Married? ");
        boolean married = sc.nextBoolean();

        System.out.println("Married: " + married);



        // ============================================================
        // 7. Taking Long Input
        // ============================================================

        /*
           nextLong() is used for large integer values.
        */

        System.out.print("Enter Your Mobile Number: ");
        long mobileNumber = sc.nextLong();

        System.out.println("Mobile Number: " + mobileNumber);



        // Closing Scanner
        sc.close();

    }
}



/*

Example Input:

Dileep
Dileep Mali
21
89.5
50000
false
9876543210


Example Output:

First Name: Dileep
Full Name: Dileep Mali
Age: 21
Percentage: 89.5
Salary: 50000.0
Married: false
Mobile Number: 9876543210

*/



// ============================================================
// Important Scanner Functions
// ============================================================

/*

1. next()
   - Reads only one word

2. nextLine()
   - Reads complete line

3. nextInt()
   - Reads integer value

4. nextFloat()
   - Reads float value

5. nextDouble()
   - Reads double value

6. nextBoolean()
   - Reads true/false

7. nextLong()
   - Reads long integer value

*/


// ============================================================
// Important Notes
// ============================================================

/*

1. Scanner is used for user input.

2. Always import Scanner before using it.

3. next() does not read spaces.

4. nextLine() reads complete line including spaces.

5. Sometimes after nextInt() or nextFloat(),
   nextLine() may skip input because of leftover newline.

   To fix this:
   use extra:

   sc.nextLine();

6. Always close Scanner using:

   sc.close();

*/
