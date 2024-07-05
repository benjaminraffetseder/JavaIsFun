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
}