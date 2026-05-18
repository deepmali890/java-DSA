package basics;

// ============================================================
// 12. Type Conversion in Java
// ============================================================

/*

Type Conversion means converting one datatype
into another datatype automatically.

This happens when:

- Both datatypes are compatible
- Destination datatype is larger than source datatype

This process is also called:

Implicit Conversion
or
Widening Conversion

*/


public class TypeConversion {

    public static void main(String[] args) {

        // ============================================================
        // Valid Type Conversion
        // ============================================================

        /*
           int is smaller datatype than long

           So Java automatically converts
           int into long.
        */

        int a = 10;

        long b = a;

        System.out.println("Value of b: " + b);



        // ============================================================
        // Invalid Type Conversion
        // ============================================================

        /*
           long is bigger datatype than int

           Java does NOT allow automatic conversion
           from long to int because data loss can happen.

           Example:

           long x = 100;
           int y = x;

           This gives error:

           incompatible types:
           possible lossy conversion from long to int

        */


    }
}



/*

Output:

Value of b: 10

*/


// ============================================================
// Why Long to Int is Not Allowed
// ============================================================

/*

Size of int  = 4 bytes
Size of long = 8 bytes

long can store bigger values than int.

If Java automatically converts long to int,
some data may be lost.

That is why Java prevents this conversion.

*/


// ============================================================
// Memory Order of Integer Types
// ============================================================

/*

byte  -> 1 byte
short -> 2 bytes
int   -> 4 bytes
long  -> 8 bytes

Smaller datatype can convert into bigger datatype automatically.

Example:

int -> long   ✅
long -> int   ❌

*/
