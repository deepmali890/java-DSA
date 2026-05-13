// ------------------------------------------------------------
// Java Basics
// ------------------------------------------------------------


// ============================================================
// 1. Boilerplate Code in Java
// ============================================================

/*
   This is the basic structure (boilerplate code) of every Java program.
   Almost every Java program starts with this structure.
*/

//public class JavaBasic {
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello Dileep");
//
//    }
//}


/*
Explanation:

1. public class JavaBasic
   - Defines a class named JavaBasic.
   - In Java, every program is written inside a class.

2. public static void main(String[] args)
   - This is the main method.
   - Program execution starts from here.

3. System.out.println()
   - Used to print output on the console.
*/



// ============================================================
// 2. Output Methods in Java
// ============================================================

/*

1. System.out.print()
   - Prints output on the same line.
   - Does NOT move to the next line.

2. System.out.println()
   - Prints output and moves the cursor to the next line.

3. \n
   - Escape sequence for a new line.
   - Works similar to println() for line breaks.

*/


// Example:

//public class JavaBasic {
//
//    public static void main(String[] args) {
//
//        System.out.print("Hello ");
//        System.out.print("Dileep");
//
//        System.out.println();
//
//        System.out.println("Welcome");
//        System.out.println("To Java");
//
//        System.out.println("Java\nDeveloper");
//
//    }
//}



/*
Output:

Hello Dileep
Welcome
To Java
Developer

*/



// ============================================================
// 3. Print Pattern in Java
// ============================================================

/*
Pattern:

*****
****
***
**
*

We use System.out.println() so that each pattern
prints on a new line.
*/


// Example:

//public class JavaBasic {
//
//    public static void main(String[] args) {
//
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");
//
//    }
//}



/*
Output:

*****
****
***
**
*

*/



// ============================================================
// 4. Variables in Java
// ============================================================

/*
Variables are used to store data in memory.

Java is a strongly typed language,
which means we must define the datatype
before storing any value.
*/


// Example:

public class JavaBasic {

    public static void main(String[] args) {

        String name = "Dileep";
        int age = 21;
        double salary = 100.00;
        char gender = 'M';
        boolean married = false;

        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + married);

    }
}



/*
Output:

Student Name: Dileep
Age: 21
Salary: 100.0
Gender: M
Married: false

*/



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


