class Node4 {
    int data;
    Node next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question5 {
    public static Node deleteLastOccurrence(Node head, int key) {
        if (head == null) {
            return null;
        }

        Node prev = null;
        Node last = null;
        Node current = head;
        Node next = null;

        // Find the last occurrence of the key
        while (current != null) {
            if (current.data == key) {
                last = prev;
            }
            prev = current;
            current = current.next;
        }

        // If the key is not found, return the original list
        if (last == null) {
            return head;
        }

        // Delete the last occurrence of the key
        if (last == null) {
            head = head.next;
        } else {
            last.next = last.next.next;
        }

        return head;
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
        // Create linked list: 1 -> 2 -> 3 -> 2 -> 4 -> 2 -> null
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(4);
        Node node6 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node head = node1;
        int key = 2;

        // Delete the last occurrence of the key from the linked list
        head = deleteLastOccurrence(head, key);

        // Print the updated linked list
        printLinkedList(head);
    }
}