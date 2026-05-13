package basics;

// ============================================================
// 8. Comments in Java
// ============================================================

/*

Comments are used to explain the code.

They make code more readable and easier to understand.

Java ignores comments during program execution.

There are mainly 3 types of comments in Java:

1. Single-line Comment
2. Multi-line Comment
3. Documentation Comment

*/


public class CommentsInJava {

    public static void main(String[] args) {

        // Declaring two variables
        int a = 10;
        int b = 5;

        // Adding two numbers
        int sum = a + b;

        // Printing the result
        System.out.println("Sum of Two Numbers: " + sum);

    }
}



/*

Output:

Sum of Two Numbers: 15

*/


// ============================================================
// 1. Single-line Comment
// ============================================================

/*

Single-line comments are used for short explanations.

Syntax:

// This is a single-line comment

Example:

// Declaring a variable
int age = 21;

*/


// ============================================================
// 2. Multi-line Comment
// ============================================================

/*

Multi-line comments are used for writing
large explanations or notes.

Syntax:

/*

   This is a multi-line comment

*\/

*/


// ============================================================
// 3. Documentation Comment
// ============================================================

/*

Documentation comments are mainly used
for generating official Java documentation.

Syntax:

/**

   Documentation Comment

*\/

*/


// ============================================================
// Important Notes
// ============================================================

/*

1. Comments improve code readability.

2. Comments do NOT affect program execution.

3. Good comments help other developers
   understand the code easily.

4. Avoid unnecessary comments.
   Write comments only where needed.

*/
