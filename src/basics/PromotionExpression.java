package basics;

// ============================================================
// 14. Type Promotion in Expressions
// ============================================================

/*

Type Promotion in Java means
Java automatically converts smaller datatypes
into larger datatypes while evaluating expressions.

This happens to avoid data loss
during calculations.

*/


public class PromotionExpression {

    public static void main(String[] args) {

        // ============================================================
        // 1. char Values are Promoted to int
        // ============================================================

        /*
           Java automatically converts
           char values into int during expressions.
        */

        char a = 'a';
        char b = 'b';

        System.out.println(b - a);

        /*
           Output:
           1

           Explanation:

           ASCII value of 'a' = 97
           ASCII value of 'b' = 98

           98 - 97 = 1
        */



        // ============================================================
        // 2. Why char Result Cannot Store int Expression
        // ============================================================

        /*
           Wrong Example:

           char c = a - b;

           Error:
           possible lossy conversion from int to char

           Reason:
           During calculation,
           Java converts both char values into int.
           Final result also becomes int.
        */



        // ============================================================
        // 3. byte, short, and char are Promoted to int
        // ============================================================

        /*
           Even if there is no int datatype,
           Java still converts:

           byte
           short
           char

           into int during expression evaluation.
        */

        short num1 = 5;
        byte num2 = 25;
        char num3 = 'c';

        int result = num1 + num2 + num3;

        System.out.println("Result: " + result);

        /*
           ASCII value of 'c' = 99

           5 + 25 + 99 = 129
        */



        // ============================================================
        // 4. Larger Datatype Dominates Expression
        // ============================================================

        /*
           If one operand is:

           long
           float
           double

           then the whole expression
           gets promoted to that datatype.
        */

        int number1 = 10;
        float number2 = 20.25f;
        long number3 = 25;
        double number4 = 30;

        double answer = number1 + number2 + number3 + number4;

        System.out.println("Final Answer: " + answer);

        /*
           Output:
           85.25

           Whole expression becomes double
           because double is the largest datatype here.
        */



        // ============================================================
        // 5. Why byte * int Gives Error
        // ============================================================

        /*
           Wrong Example:

           byte b = 5;
           b = b * 2;

           Error:
           possible lossy conversion from int to byte

           Reason:
           During multiplication,
           byte automatically becomes int.
        */



        // ============================================================
        // 6. Correct Way Using Type Casting
        // ============================================================

        byte value = 5;

        value = (byte) (value * 2);

        System.out.println("Updated Byte Value: " + value);

        /*
           Output:
           10
        */

    }
}
