package function;

import java.util.Arrays;

public class VariablesArguments {
    public static void main(String[] args) {
        // Calling the 'fun' method with integers
        fun(2, 3, 45, 636, 45, 2, 1, 2);

        // Calling the 'multipal' method with two integers followed by string arguments
        multipal(2, 3, "govind", "ghosh");
    }

    // Method that accepts variable-length integers (varargs)
    static void fun(int ...v) {
        // Converts the array of integers to a string representation
        String var = Arrays.toString(v);
        System.out.println(var);  // Prints the array as a string
    }

    // Method that accepts two integers and a variable-length string array (varargs)
    static void multipal(int a, int b, String ...v) {
        // Combines the two integers and the array of strings into a single string
        String var = a + ", " + b + ", " + Arrays.toString(v);
        System.out.println("multipal " + var);  // Prints the combined result
    }
}
