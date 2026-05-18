package basics;

import java.util.Scanner;

// ============================================================
// 13. Type Casting in Java
// ============================================================

/*

Type Casting means converting one datatype
into another datatype manually.

This is done forcefully by the programmer.

Type Casting is mainly used when:

- We want to convert larger datatype
  into smaller datatype

This process is also called:

Explicit Conversion
or
Narrowing Conversion

*/


public class TypeCasting {

    public static void main(String[] args) {

        // ============================================================
        // Invalid Conversion
        // ============================================================

        /*
           float is larger datatype than int

           So Java does NOT allow automatic conversion.

           Example:

           float number = 99.99f;
           int number2 = number;

           Error:
           possible lossy conversion from float to int

        */



        // ============================================================
        // Type Casting Example
        // ============================================================

        /*
           Here we manually convert
           float into int using type casting.
        */

        float number = 99.99f;

        int number2 = (int) number;

        System.out.println("Original Float Value: " + number);

        System.out.println("After Type Casting: " + number2);

    }
}



/*

Output:

Original Float Value: 99.99
After Type Casting: 99

*/


// ============================================================
// Explanation
// ============================================================

/*

1. float stores decimal values.

2. int stores only integer values.

3. During type casting:

   int number2 = (int) number;

   Java removes the decimal part.

4. Data loss can happen during type casting.

5. Type Casting must be done manually.

*/


// ============================================================
// Important Notes
// ============================================================

/*

Type Conversion:
- Automatic
- Smaller -> Bigger

Example:
int -> long

--------------------------------------------------

Type Casting:
- Manual
- Bigger -> Smaller

Example:
float -> int

--------------------------------------------------

Examples:

int -> long      ✅ Type Conversion
float -> int     ✅ Type Casting
double -> int    ✅ Type Casting
long -> short    ✅ Type Casting

*/
