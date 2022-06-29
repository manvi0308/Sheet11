
public class MergeTwoSortedLinkedList {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    // ! Recursive Solution
    // ! Time Complexity - O(N + M)
    // ! Space Complexity - O(N + M)

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        if (first == null)
            return second;
        if (second == null)
            return first;

        if (first.data < second.data) {
            first.next = sortTwoLists(first.next, second);
            return first;
        }

        else {
            second.next = sortTwoLists(first, second.next);
            return second;
        }
    }

    // ! Iterative Solution
    // ! The idea is to play around the next pointers of nodes
    // ! l1 should always point to the smaller node
    // ! https://takeuforward.org/data-structure/merge-two-sorted-linked-lists/

    public static LinkedListNode<Integer> sortTwoListsIterative(LinkedListNode<Integer> first,
            LinkedListNode<Integer> second) {
        if (first == null)
            return second;
        if (second == null)
            return first;

        // first should point to smaller node
        if (first.data > second.data) {
            LinkedListNode temp = first;
            first = second;
            second = temp;
        }

        LinkedListNode res = first;
        while (first != null && second != null) {
            LinkedListNode temp = null;
            while (first != null && first.data <= second.data) {
                temp = first;
                first = first.next;
            }

            temp.next = second;

            // swap
            LinkedListNode tmp = first;
            first = second;
            second = tmp;
        }

        return res;
    }

}
