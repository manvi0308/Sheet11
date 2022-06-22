import java.util.*;
import java.io.*;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Solution {
    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> reverseHead = null;

        while (current != null) {
            LinkedListNode<Integer> currentNext = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = currentNext;
        }

        return reverseHead;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // & The intution is palindrome is when the first half
        // & is equal to the reverse of second half

        // ! Finding the middle of linked list
        // ! Tortoise hare approach
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        LinkedListNode prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        // & fast would be null for even elements
        // & fast would not be null for odd elements -- Don't consider the
        // & middle element in that case
        if (fast != null) {
            slow = slow.next;
        }

        if (slow == null) {
            return true;
        }

        prev.next = null;
        LinkedListNode<Integer> reverseHead = reverse(slow);

        while (head != null) {
            if (!head.data.equals(reverseHead.data)) {
                return false;
            }

            reverseHead = reverseHead.next;
            head = head.next;
        }

        return true;
    }
}
