package basics;


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

public class VariablesInJava {

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
