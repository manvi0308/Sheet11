public class DeleteNode {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        LinkedListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void deleteNode(LinkedListNode<Integer> node) {
        // Write your code here.
        // ! Reference to the head node is not given
        // ! Reference to the node to be deleted is given
        // ! Thus we have to store the data of the next node
        // ! of K in the node K itself and then delete the
        // ! next node of K by making K.next = K.next.next
        // & 1-->2-->3-->4-->5-->Null
        //            |
        //           node
        LinkedListNode<Integer> temp;
        if (node == null) {
            temp = node;
        } else {
            temp = node.next;
        }
        // & 1-->2-->3-->4-->5-->Null
        //&          |   |
        //&         node temp

        node.data = temp.data;
        // & 1-->2-->4-->4-->5-->Null
        //&          |   |
        //&         node temp
        node.next = (temp == null) ? null : (temp.next);
        //& 1-->2-->4   4-->5-->Null
        //&         |___|___|
        //&      node  temp
        
        temp = null;
        //& 1-->2-->4-->5-->Null
    }
}
