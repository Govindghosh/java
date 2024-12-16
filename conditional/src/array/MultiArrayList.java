package array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare a multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize the outer list and add inner lists
        System.out.println("Add integers to the multi-dimensional list:");
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // Add a new inner list
        }

        // Populate the multi-dimensional ArrayList
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 3 integers for row " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Display the multi-dimensional ArrayList
        System.out.println("Multi-dimensional ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Row " + (i + 1) + ": " + list.get(i));
        }

        // Close the scanner
        in.close();
    }
}
