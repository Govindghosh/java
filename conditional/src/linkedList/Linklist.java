package linkedList;

// Node class representing an element of the linked list
class Node {
    int val;
    Node next;

    // Constructor to initialize a node with a value
    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor to initialize a node with a value and a reference to the next node
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class Linklist {

    private Node head; // Points to the first node of the list
    private Node tail; // Points to the last node of the list
    private int size;  // Tracks the number of nodes in the list

    public Linklist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert a new node at the beginning of the list
    public void insertAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) { // If the list was empty, tail should also point to the new node
            tail = head;
        }
        size++;
    }

    // Insert a new node at the end of the list
    public void insertAtTail(int val) {
        if (tail == null) { // If the list is empty, insert at head
            insertAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert a new node at a specific index
    public void insert(int val, int index) {
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        if (index == size) {
            insertAtTail(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) { // Traverse to the node before the target position
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove the first node of the list
    public void removeAtHead() {
        if (head == null) { // If the list is empty, nothing to remove
            return;
        }
        head = head.next;
        if (head == null) { // If the list becomes empty, reset tail to null
            tail = null;
        }
        size--;
    }
    // Remove the last node of the list
    public void removeAtTail() {
        if (head == null) { // If the list is empty, nothing to remove
            return;
        }
        if (head.next == null) { // If there's only one element, remove it
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) { // Traverse to the second-last node
            temp = temp.next;
        }
        temp.next = null; // Remove reference to the last node
        tail = temp; // Update the tail
        size--;
    }
    // Remove a  node at a specific index
    public void remove(int index){
        if (index < 0 || index >= size) { // Check for invalid index
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) { // If removing the head
            removeAtHead();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) { // Traverse to the node before the target position
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) { // If the removed node was the tail, update tail
            tail = temp;
        }
        size--;
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }
}