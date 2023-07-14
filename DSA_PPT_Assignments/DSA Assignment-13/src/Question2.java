class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question2{
    public static void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list: 11 -> 11 -> 11 -> 21 -> 43 -> 43 -> 60 -> null
        Node node1 = new Node(11);
        Node node2 = new Node(11);
        Node node3 = new Node(11);
        Node node4 = new Node(21);
        Node node5 = new Node(43);
        Node node6 = new Node(43);
        Node node7 = new Node(60);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Node head = node1;

        // Remove duplicates from the linked list
        removeDuplicates(head);

        // Print the updated linked list
        printLinkedList(head);
    }
}