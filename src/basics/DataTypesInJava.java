package basics;

// ============================================================
// 5. Why Datatypes are Required in Java
// ============================================================

/*

In Java, we must define the datatype before storing data.

Example:

int age = 21;

Here:
- int is the datatype
- age is the variable name
- 21 is the value

Why Java uses datatypes:
- Better memory management
- Better performance
- Strong type safety
- Fewer runtime errors

JavaScript vs Java:

JavaScript:
- Automatically detects datatype.
- Example:
    let age = 21;

Java:
- Datatype must be defined manually.
- Example:
    int age = 21;

Java is stricter than JavaScript,
which helps make applications more secure and optimized.

literal are not changed becuase this is unvercial
and variable are changed

*/

// ============================================================
// 6. Data Types in Java
// ============================================================

/*

A language in which we must define the datatype
before storing values is called a Typed Language.

Java is a strongly typed language because
every variable must have a datatype.

There are mainly 2 types of Data Types in Java:

1. Primitive Data Types
2. Non-Primitive Data Types

*/


// ============================================================
// 1. Primitive Data Types
// ============================================================

/*

Primitive datatypes are predefined by Java.
They store simple values directly in memory.

There are 8 primitive data types in Java:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

*/


// ============================================================
// Primitive Data Types with Size
// ============================================================

/*

1. byte
   - Size: 1 byte
   - Stores small integer values

2. short
   - Size: 2 bytes
   - Stores short integer values

3. int
   - Size: 4 bytes
   - Most commonly used integer datatype

4. long
   - Size: 8 bytes
   - Stores very large integer values

5. float
   - Size: 4 bytes
   - Stores decimal numbers (less precision)

6. double
   - Size: 8 bytes
   - Stores decimal numbers (high precision)

7. char
   - Size: 2 bytes
   - Stores a single character

8. boolean
   - Size: JVM dependent (commonly 1 bit)
   - Stores true or false values

*/


// ============================================================
// 2. Non-Primitive Data Types
// ============================================================

/*

Non-Primitive datatypes are created by programmers
or provided by Java libraries.

They store references (memory addresses)
instead of actual values.

Examples:

- String
- Array
- Class
- Object
- Interface

*/


// ============================================================
// Example of Primitive Data Types
// ============================================================

public class DataTypesInJava {

    public static void main(String[] args) {

        // byte
        byte b = 8;
        System.out.println("Byte Value: " + b);

        // char
        char c = 'A';
        System.out.println("Character Value: " + c);

        // short
        short s = 2;
        System.out.println("Short Value: " + s);

        // int
        int i = 5;
        System.out.println("Integer Value: " + i);

        // long
        long l = 9L;
        System.out.println("Long Value: " + l);

        // float
        float f = 3.14f;
        System.out.println("Float Value: " + f);

        // double
        double d = 1.2;
        System.out.println("Double Value: " + d);

        // boolean
        boolean bool = true;
        System.out.println("Boolean Value: " + bool);

    }
}


/*

Output:

Byte Value: 8
Character Value: A
Short Value: 2
Integer Value: 5
Long Value: 9
Float Value: 3.14
Double Value: 1.2
Boolean Value: true

*/



// ============================================================
// Important Notes
// ============================================================

/*

1. float values must end with 'f'
   Example:
   float num = 3.14f;

2. long values can end with 'L'
   Example:
   long num = 9999L;

3. char uses single quotes
   Example:
   char grade = 'A';

4. String uses double quotes
   Example:
   String name = "Dileep";

*/


// ============================================================
// Memory Order of Primitive Data Types
// ============================================================

/*

Smaller to Larger:

byte  -> 1 byte
short -> 2 bytes
int   -> 4 bytes
long  -> 8 bytes

float  -> 4 bytes
double -> 8 bytes

char -> 2 bytes
boolean -> true/false

*/
