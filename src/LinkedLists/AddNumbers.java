public class AddNumbers {
    class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
        }
    }

    /*
     * The trick is here we somehow need to get access to the head
     * of the sum linked list
     * 
     * To do so we will first create a dummy node
     * That dummy node will be pointed to by temp pointer
     * //! That is temp--->dummy
     * Now as we will sum the nodes the temp pointer will be used
     * In the end the scenario would be
     * //! dummy --> s1 ---> s2 ---> s3
     * //!                            |
     * //!                           temp
     * //! 
     * Return the dummy.next
     * 
     * //! DRY RUN
     * 2 4 3
     * 5 6 4
     * 
     * 0
     * DUMMY
     * TEMP (Copy of Dummy Node)
     * The dummy.next will always point to head of sum linked list
     * 
     * 0 ---> 7
     * D      T
     * 
     * 0 ---> 7 ---> 0
     * D             T
     * 
     * 0 ---> 7 ---> 0 ---> 8
     * D                    T
     * 
     */
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode dummy = new LinkedListNode();
        LinkedListNode temp = dummy;
        int carry = 0;

        while (head1 != null || head2 != null || carry == 1) {
            int sum = 0;
            if (head1 != null) {
                sum = sum + head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum = sum + head2.data;
                head2 = head2.next;
            }
            sum += carry;
            carry = sum / 10;
            LinkedListNode node = new LinkedListNode(sum % 10);
            temp.next = node;
            temp = temp.next;

        }

        return dummy.next;
    }
}
