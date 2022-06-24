class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Solution {

    public static void insertAt(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public static Node findMiddle(Node head) {
        // Empty LL
        if (head == null)
            return null;

        // Single element LL
        if (head.next == null)
            return head;

        // For all other cases
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
}
