package linkedList;

public class DoubleLinklist {

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }
    public void displayRev() {
        Node node = head;
        if (node == null) {
            System.out.println("List is empty");
            return;
        }

        // Move to the tail
        while (node.next != null) {
            node = node.next;
        }

        // Now print in reverse
        System.out.print("Reverse: ");
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.println("Start");
    }
}
