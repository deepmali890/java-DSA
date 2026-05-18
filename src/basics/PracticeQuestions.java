package basics;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
//        Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
//        these 3 numbers

        Scanner sc = new Scanner(System.in);

//        Taking Input
        System.out.print("Enter the first number: ");
        int A = sc.nextInt();

        System.out.print("Enter the Second number: ");
        int B = sc.nextInt();

        System.out.print("Enter the third number: ");
        int C = sc.nextInt();

        int average = (A + B + C) / 3;
        System.out.println("The average is " + average);

//        sc.close();


//        Question 2: In a program, input the side of a square. You have to output the area of the
//        square.

//        Formula = side * side

//        Taking Inout
        System.out.println("Enter Side of Squere");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("The area is " + area);


//
//        Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//        an eraser. You have to output the total cost of the items back to the user as their bill.
//        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


//        Taking Inout
        System.out.print("Enter Pencil Price: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter Pen Price: ");
        float pen = sc.nextFloat();

        System.out.print("Enter Eraser Price: ");
        float eraser = sc.nextFloat();

//        Calculting total bills
        float totalBill = pencil + pen + eraser;
        System.out.println("The total price is " + totalBill);

//        Add gst
        float gst = totalBill * 18 / 100;

        float finalBill = totalBill + gst;

         System.out.println("Total Bill Without GST: " + totalBill);

         System.out.println("Total GST: " + gst);

        System.out.println("Final Bill With GST: " + finalBill);






    }
}