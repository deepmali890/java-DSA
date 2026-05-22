package operators;

public class Test {

    public static void main(String[] args) {

        // ============================================================
        // Question 1
        // ============================================================

        /*
           What will be the output
           of the following program?
        */

        int a = 2, b = 5;

        int exp1 = (a * b / a);

        int exp2 = (a * (b / a));

        System.out.print(exp1 + ",");

        System.out.println(exp2);



        // ============================================================
        // Question 2
        // ============================================================

        int num1 = 200, num2 = 50, num3 = 100;

        if (num1 > num2 && num2 > num3) {

            System.out.println("Hello");

        }

        if (num3 > num2 && num3 < num1) {

            System.out.println("Java");

        }

        if ((num2 + 200) < num1 && (num2 + 150) < num3) {

            System.out.println("Hello Java");

        }



        // ============================================================
        // Question 3
        // ============================================================

        int first, second, third;

        first = second = third = 2;

        first += second;

        second -= third;

        third /= (first + second);

        System.out.println(first + " " + second + " " + third);



        // ============================================================
        // Question 4
        // ============================================================

        int value1 = 9, value2 = 12;

        int p = 2, q = 4, r = 6;

        int expression = 4 / 3 * (value1 + 34)
                + 9 * (p + q * r)
                + (3 + value2 * (2 + p)) / (p + q * value2);

        System.out.println(expression);



        // ============================================================
        // Question 5
        // ============================================================

        int number1 = 10, number2 = 5;

        int result1 = (number2 * (number1 / number2 + number1 / number2));

        int result2 = (number2 * number1 / number2 + number2 * number1 / number2);

        System.out.println(result1);

        System.out.println(result2);

    }
}