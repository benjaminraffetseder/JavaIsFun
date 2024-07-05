/**
 * The Main class represents the entry point of the application.
 */
public class Main {

    /**
     * The main method is the entry point of a Java application.
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {

        // Single line comment
        System.out.println("1. Single line comment: It starts with two forward slashes (//). Everything to the right of them on the same line is considered a comment.");

        // Multi-line comment
        System.out.println("2. Multi-line comment: It starts with a forward slash and an asterisk (/*), and ends with an asterisk and a forward slash (*/). Everything between these two is considered a comment.");

        // Declare and initialize variables
        int myNumber = 100; // An integer variable
        short myShort = 10000; // A short variable
        long myLong = 1000000000; // A long variable

        double myDouble = 7.5; // A double variable
        float myFloat = 5.5f; // A float variable

        char myChar = 'y'; // A char variable

        boolean myBoolean = true; // A boolean variable

        byte myByte = 127; // A byte variable

        // Print the variables
        System.out.println("Data Types in Java");
        System.out.println("Variables are containers for storing data values.");
        System.out.println("In Java, there are different types of variables, for example:");
        System.out.println("int: " + myNumber + " - used for whole numbers");
        System.out.println("short: " + myShort + " - used for whole numbers with smaller range");
        System.out.println("long: " + myLong + " - used for whole numbers with larger range");
        System.out.println("double: " + myDouble + " - used for fractional numbers");
        System.out.println("float: " + myFloat + " - used for fractional numbers with smaller precision");
        System.out.println("char: " + myChar + " - used for single characters");
        System.out.println("boolean: " + myBoolean + " - used for logical conditions");
        System.out.println("byte: " + myByte + " - used for whole numbers with smallest range");

        System.out.println("\n");
        System.out.println("These data types are divided into two categories: Primitive Data Types and Non-Primitive Data Types.");
        System.out.println("Primitive Data Types: These are the most basic data types in Java. They are predefined by the language and named by a reserved keyword. For example, int, char, boolean, etc.");
        System.out.println("Non-Primitive Data Types: These are not predefined by the language, but are created by the programmer. They are also called reference types because they refer to objects. For example, String, Arrays, Classes, etc.");

        // Strings
        String myString = "Hello World"; // A String variable

        System.out.println("\n");
        System.out.println("String Data Type in Java");
        System.out.println("String: " + myString + " - used for text");
        System.out.println("'String' is not a primitive data type, it is a class in Java. It is used to store text and always enclosed in double quotes. Being a class, it has many built-in methods to manipulate the text. For example, to get the length of the string, you can use the length() method.");
        System.out.println("Length of the string: " + myString.length());

    }
}