package basics;
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

public class OutputInJava {

    public static void main(String[] args) {

        System.out.print("Hello ");
        System.out.print("Dileep");

        System.out.println();

        System.out.println("Welcome");
        System.out.println("To Java");

        System.out.println("Java\nDeveloper");

    }
}



/*
Output:

Hello Dileep
Welcome
To Java
Developer

*/
