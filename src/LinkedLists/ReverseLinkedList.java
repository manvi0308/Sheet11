public class ReverseLinkedList {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        // Write your code here!
        LinkedListNode<Integer> prev = null;

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }
}
