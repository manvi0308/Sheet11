public class MiddleOfLinkedList {

    public static Node findMiddle(Node head) {

        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
