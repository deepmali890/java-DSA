package functions;

// ============================================================
// Call Stack Demo in Java
// ============================================================

/*

This program explains
how functions execute
inside memory using Call Stack.

Function Calling Order:

main() -> functionB() -> functionA()

*/


public class CallStackDemo {



    // ============================================================
    // Function A
    // ============================================================

    public static void functionA() {

        System.out.println("Function A");

    }



    // ============================================================
    // Function B
    // ============================================================

    public static void functionB() {

        // Calling Function A
        functionA();

        System.out.println("Function B");

    }



    // ============================================================
    // Main Method
    // ============================================================

    public static void main(String[] args) {

        // Calling Function B
        functionB();

        System.out.println("Main Function");

    }
}



/*

Output:

Function A
Function B
Main Function

*/


// ============================================================
// Explanation
// ============================================================

/*

1. Program execution
   starts from main().

--------------------------------------------------

2. main() calls functionB().

--------------------------------------------------

3. functionB() calls functionA().

--------------------------------------------------

4. functionA() executes first.

--------------------------------------------------

5. After functionA() finishes,
   control returns to functionB().

--------------------------------------------------

6. After functionB() finishes,
   control returns to main().

--------------------------------------------------

7. Functions execute
   using Call Stack memory.

--------------------------------------------------

Call Flow:

main()
   ↓
functionB()
   ↓
functionA()

*/
