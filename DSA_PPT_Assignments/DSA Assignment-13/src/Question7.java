
class Node6 {
    int data;
    Node prev;
    Node next;

    Node6(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Question7 {
    public static Node reverseDoublyLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        // Swap prev and next pointers for all nodes
        while (current != null) {
            temp = (Node) current.prev;
            current.prev = current.next;
            current.next = temp;
            current = (Node) current.prev; // Move to the next node
        }

        // Update the head
        head = (Node) temp.prev;

        return head;
    }

    public static void printDoublyLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a doubly linked list: 1 <-> 2 <-> 3 <-> 4
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;

        Node head = node1;

        // Reverse the doubly linked list
        head = reverseDoublyLinkedList(head);

        // Print the reversed list
        printDoublyLinkedList(head);
    }
}