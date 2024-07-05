/**
 * Represents the main class of the application.
 * This class is the starting point of the Java application. It contains the main method,
 * which is the entry point for any Java program. The Java Virtual Machine (JVM) calls the
 * main method of this class to start the execution of the application.
 */
public class Main {
    /**
     * The main method serves as the entry point for the Java application.
     * <p>
     * This method is called by the Java Virtual Machine (JVM) to start the execution of the application.
     * It is the method where the program begins execution. The `main` method is static, meaning it can be
     * called without creating an instance of the class. The `main` method accepts an array of Strings as
     * its parameter, which allows the program to receive command-line arguments.
     * <p>
     * Inside the `main` method, we call four other methods to demonstrate different concepts:
     * <p>
     * 1. `printSingleLineComment()` - Demonstrates how single-line comments are used in Java.
     * Single-line comments are useful for short explanations or annotations in the code.
     * <p>
     * 2. `printMultiLineComment()` - Shows the use of multi-line comments in Java.
     * Multi-line comments are used for longer descriptions or to temporarily disable blocks of code.
     * <p>
     * 3. `printDataTypes()` - Provides examples of using various primitive data types in Java.
     * This method explains the basic types of data that Java can work with, such as integers, floating-point numbers,
     * characters, and booleans.
     * <p>
     * 4. `printStringDataType()` - Focuses on the String data type, which is not primitive but is widely used in Java.
     * This method demonstrates how Strings are used to store and manipulate text.
     * <p>
     * 5. `printWhileLoop()` - Demonstrates the use of a while loop in Java.
     * This method showcases how a while loop can be used to execute a block of code repeatedly
     * as long as a given condition is true. It's a fundamental concept in programming that allows
     * for repetitive tasks to be performed with minimal code.
     * <p>
     * 6. `printForLoop()` - Demonstrates the use of a for loop in Java to print numbers from 0 to 9.
     * This method uses a for loop, a control flow statement that allows code to be executed repeatedly
     * based on a condition. The loop initializes a counter (i), sets a condition for the loop to continue running,
     * and increments the counter after each iteration. This loop prints the value of the counter during each iteration.
     * <p>
     * 7. `printIfStatement()` - Demonstrates the use of if statements in Java.
     * This method showcases how conditional statements (if statements) are used to execute code blocks based on certain conditions.
     * It introduces the concept of comparing variable values and executing code only when the condition is true.
     * <p>
     * 8. `printElseStatement()` - Demonstrates the use of if-else statements and a while loop in Java.
     * This method showcases two fundamental control flow mechanisms in Java: conditional statements (if-else) and loops (while).
     * It first demonstrates an if-else statement to check a condition and execute different blocks of code based on the result.
     * Then, it uses a while loop to perform repetitive actions with an embedded if-else statement to demonstrate condition checking within the loop.
     * <p>
     * These methods together provide a basic introduction to some of the fundamental concepts in Java programming.
     *
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {
        printSingleLineComment();
        printMultiLineComment();
        printDataTypes();
        printStringDataType();
        printWhileLoop();
        printForLoop();
        printIfStatement();
        printElseStatement();
    }

    private static void printSingleLineComment() {
        System.out.println("1. Single line comment: It starts with two forward slashes (//). " +
                "Everything to the right of them on the same line is considered a comment.");
    }

    private static void printMultiLineComment() {
        System.out.println("2. Multi-line comment: It starts with a forward slash and an asterisk (/*), " +
                "and ends with an asterisk and a forward slash (*/). " +
                "Everything between these two is considered a comment.");
    }

    /**
     * Demonstrates the use of primitive data types in Java.
     * This method provides examples of how different primitive data types are used to store various kinds of data.
     * It also introduces the concept of variables as containers for data values and explains the distinction between
     * primitive and non-primitive data types.
     */
    private static void printDataTypes() {
        // Declaration and initialization of various primitive data types
        int number = 100; // 'int' is used for whole numbers
        short shortNumber = 10000; // 'short' is used for whole numbers with a smaller range than 'int'
        long longNumber = 1000000000; // 'long' is used for whole numbers with a larger range than 'int'
        double doubleNumber = 7.5; // 'double' is used for fractional numbers with more precision
        float floatNumber = 5.5f; // 'float' is used for fractional numbers with less precision than 'double'
        char character = 'y'; // 'char' is used for single characters
        boolean booleanValue = true; // 'boolean' is used for true/false values
        byte byteNumber = 127; // 'byte' is used for whole numbers with the smallest range

        // Printing examples of each primitive data type
        System.out.println("Data Types in Java");
        System.out.println("Variables are containers for storing data values.");
        System.out.println("In Java, there are different types of variables, for example:");
        System.out.println("int: " + number + " - used for whole numbers");
        System.out.println("short: " + shortNumber + " - used for whole numbers with smaller range");
        System.out.println("long: " + longNumber + " - used for whole numbers with larger range");
        System.out.println("double: " + doubleNumber + " - used for fractional numbers");
        System.out.println("float: " + floatNumber + " - used for fractional numbers with smaller precision");
        System.out.println("char: " + character + " - used for single characters");
        System.out.println("boolean: " + booleanValue + " - used for logical conditions");
        System.out.println("byte: " + byteNumber + " - used for whole numbers with smallest range");

        // Explanation of primitive vs. non-primitive data types
        System.out.println("\n");
        System.out.println("These data types are divided into two categories: Primitive Data Types and Non-Primitive Data Types.");
        System.out.println("Primitive Data Types: These are the most basic data types in Java. " +
                "They are predefined by the language and named by a reserved keyword. For example, int, char, boolean, etc.");
        System.out.println("Non-Primitive Data Types: These are not predefined by the language, but are created by the programmer. " +
                "They are also called reference types because they refer to objects. For example, String, Arrays, Classes, etc.");
    }

    /**
     * Demonstrates the use of the String data type in Java.
     * This method showcases how Strings are used to store text data,
     * introduces the concept of Strings being non-primitive data types,
     * and demonstrates some basic operations that can be performed on Strings.
     */
    private static void printStringDataType() {
        // Declaration and initialization of a String variable with the text "Hello World"
        String string = "Hello World";

        // Prints a newline for better readability in the console output
        System.out.println("\n");
        // Introduction to the String data type in Java
        System.out.println("String Data Type in Java");
        // Demonstrates storing text in a String variable and printing it
        System.out.println("String: " + string + " - used for text");
        // Explanation that String is a class in Java, not a primitive data type
        System.out.println("'String' is not a primitive data type, it is a class in Java. " +
                "It is used to store text and always enclosed in double quotes. " +
                "Being a class, it has many built-in methods to manipulate the text. " +
                "For example, to get the length of the string, you can use the length() method.");
        // Demonstrates using the length() method to get the length of the string
        System.out.println("Length of the string: " + string.length());

        // Declaration and initialization of String variables to demonstrate string concatenation
        String firstName = "John";
        String lastName = "Doe";
        // Concatenates firstName and lastName with a space in between to form fullName
        String fullName = firstName + " " + lastName;
        // The fullName variable is declared but not used further in this method
        // It is only used to demonstrate string concatenation
        System.out.println("\n");
        System.out.println("String Concatenation in Java");
        System.out.println("Concatenating Strings: " + fullName);
    }

    /**
     * Demonstrates the use of a while loop in Java.
     * This method showcases how a while loop can be used to execute a block of code repeatedly
     * as long as a given condition is true. It's a fundamental concept in programming that allows
     * for repetitive tasks to be performed with minimal code.
     */
    private static void printWhileLoop() {
        // Initialize a variable 'value' with 0. This variable will be used to control the loop.
        int value = 0;

        // The while loop starts. It will continue to loop as long as 'value' is less than 10.
        while (value < 10) {
            // Prints the current value of 'value' to the console.
            System.out.println("Value: " + value);
            // Increments 'value' by 1. This is crucial to ensure the loop eventually ends.
            // Without this increment, the loop would continue indefinitely, resulting in an infinite loop.
            value++;
            //^ This is equivalent to writing 'value = value + 1;'
            // You can also use the shorthand 'value += 1;' to achieve the same result.
            // The '++' operator is a shortcut for incrementing a variable by 1.
        }
        // Once 'value' reaches 10, the condition (value < 10) becomes false, and the loop exits.
        // The method then completes its execution.
        System.out.println("Loop completed.");
    }

    /**
     * Demonstrates the use of a for loop in Java to print numbers from 0 to 9.
     * <p>
     * This method uses a for loop, a control flow statement that allows code to be executed repeatedly
     * based on a condition. The loop initializes a counter (i), sets a condition for the loop to continue running,
     * and increments the counter after each iteration. This loop prints the value of the counter during each iteration.
     * </p>
     * <p>
     * The method also demonstrates the difference between System.out.println and System.out.printf for printing output.
     * - System.out.println prints the given message followed by a newline character, moving the cursor to the next line.
     * - System.out.printf allows for formatted output, where you can specify the type of data being printed and format it accordingly.
     * </p>
     * <p>
     * In the printf statement, "%d" is a format specifier that indicates an integer value will be printed in its place.
     * The "\n" is a newline character, which moves the cursor to the next line after printing the current line.
     * </p>
     */
    private static void printForLoop() {
        // Initializes the loop variable 'i' and sets the loop to run as long as 'i' is less than 10.
        // After each iteration, 'i' is incremented by 1.
        for (int i = 0; i < 10; i++) {
            // Prints the value of 'i' using formatted output. '%d' is replaced by the value of 'i', and '\n' adds a new line after the output.
            System.out.printf("Value: %d\n", i);

            // System.out.println("Value: " + i); // This line is commented out to demonstrate an alternative printing method.
        }
    }

    /**
     * Demonstrates the use of if statements in Java.
     * <p>
     * This method showcases how conditional statements (if statements) are used to execute code blocks based on certain conditions.
     * It introduces the concept of comparing variable values and executing code only when the condition is true.
     * </p>
     * <p>
     * Note: There is also a concept of "else" that can be used with "if" to execute code when the condition is false. This will be covered in the next section.
     * </p>
     */
    private static void printIfStatement() {
        // Initialize a variable 'myInt' with the value 0.
        int myInt = 0;

        // First if statement: checks if 'myInt' is equal to 4.
        // Since 'myInt' is initialized with 0, this condition is false, and the code inside this block will not execute.
        if (myInt == 4) {
            System.out.println("The value of myInt is 4.");
        }

        // Second if statement: checks if 'myInt' is equal to 0.
        // This condition is true because 'myInt' is indeed 0. Therefore, the code inside this block will execute, printing the message.
        if (myInt == 0) {
            System.out.println("The value of myInt is 0.");
        }
    }

    /**
     * Demonstrates the use of if-else statements and a while loop in Java.
     * <p>
     * This method showcases two fundamental control flow mechanisms in Java: conditional statements (if-else) and loops (while).
     * It first demonstrates an if-else statement to check a condition and execute different blocks of code based on the result.
     * Then, it uses a while loop to perform repetitive actions with an embedded if-else statement to demonstrate condition checking within the loop.
     * </p>
     */
    private static void printElseStatement() {
        // Initialize a variable 'myInt' with the value 0.
        int myInt = 0;

        // If-else statement to check if 'myInt' equals 4.
        // If the condition is true, it prints "The value of myInt is 4."
        // Otherwise, it prints "The value of myInt is not 4."
        if (myInt == 4) {
            System.out.println("The value of myInt is 4.");
        } else {
            // This block is executed because 'myInt' is not 4.
            System.out.println("The value of myInt is not 4.");
        }
        // This line is printed regardless of the if-else outcome because it's outside the if-else block.
        System.out.println("This line is always printed because it is outside the if-else block.");

        // Initialize a loop control variable 'loops' with 0.
        int loops = 0;

        // A while loop that continues as long as 'loops' is less than 5.
        while (loops < 5) {
            // Prints the current iteration number.
            System.out.println("Loop iteration: " + loops);

            // Inside the loop, an if-else statement checks if 'loops' equals 3.
            // It prints a specific message if true, and a different one if false.
            if (loops == 3) {
                System.out.println("Loop iteration is 3.");
            } else {
                System.out.println("Loop iteration is not 3.");
            }
            // Increment 'loops' to avoid an infinite loop.
            loops++;
        }
        // The while loop ends when 'loops' reaches 5.
    }
}