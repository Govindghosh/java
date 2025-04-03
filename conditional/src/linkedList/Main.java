package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist(); // Create a new linked list
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(99);
        list.insert(100, 1);
        list.removeAtHead();
        list.removeAtTail();
        list.remove(1);

        list.printList();  // Output: 30 -> 20 -> 10 -> null
        System.out.println("Size: " + list.getSize()); // Output: Size: 3
        list.printList();
        System.out.println(list.find(100)); // Find and print node if found
    }
}
