package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(99);
        list.insert(100,1);
        list.removeAtHead();
        list.removeAtTail();
        list.remove(1);

        list.printList();  // Output: 30 -> 20 -> 10 -> END
        System.out.println("Size: " + list.getSize()); // Output: Size: 3
    }
}
