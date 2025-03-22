package objectOrientedPrograming.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Multi-thread (Non-Synchronized) - Best for single-threaded applications
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList);

        // LinkedList - Efficient for frequent insertions and deletions
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        System.out.println("LinkedList: " + linkedList);

        // Vector - Synchronized (Thread-safe) but slower compared to ArrayList
        List<Integer> vector = new Vector<>();
        vector.add(70);
        vector.add(80);
        vector.add(90);
        System.out.println("Vector: " + vector);

        // Example of accessing and modifying elements
        arrayList.set(1, 25); // Changing value at index 1
        linkedList.remove(0); // Removing first element
        vector.add(100); // Adding a new element

        System.out.println("Updated ArrayList: " + arrayList);
        System.out.println("Updated LinkedList: " + linkedList);
        System.out.println("Updated Vector: " + vector);
    }
}
