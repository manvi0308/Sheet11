public class IntersectionOfTwoLinkedLists {
    class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}
	//! TLE error ---because of two while loops
    public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
			/*
			 * Intersection of two LLs means a common node between them
			 * not data bcoz two different nodes can have the same data
			 * 
			 * Approach 1
			 * https://lh4.googleusercontent.com/zDRIcBToS6sC_ZdFN6p5vdel95-kPq736LHU4ldIHQWNtURwNxVC_4iRxbS9RE6q06pb-KWujO7ISc7yiJhLBg1_Bl7tGUxeKrbiwdBJHEFO-QeSPckvJrFSF1ctEtdo6Wpw4Yzy
			 * 
			 * Fix a node in the second linked list say head2 iterate through LL1
			 * Check if LL1 has common node with second linked list
			 * If nothing common found, move the head2 ahead by a single step
			 * head1 will be back to the first node of LL1 -- So we will use a temp pointer instead of directly manipulating head1
			 *
			 */

			 while(secondHead != null){
				LinkedListNode temp = firstHead;
				while(temp != null){
					if(temp == secondHead)
						return secondHead;
					temp = temp.next;
				}
				// if we have reached here and nothin is returned that means the secondHead needs to move a step ahead

				secondHead = secondHead.next;
			 }

			 return null;
	}

	//! Accepted solution --> TC --> O(N + M)
	//! SC --> O(N + M)

	public static int findIntersectionTwo(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead){
		/*
		 * Using Hashing
		 * Since the common attribute is node, we can hash the node value and keep it in a set
		 * Note that we are using set because set stores unique keys only
		 * Now again iterate through second LL, check for each node if its hash is present in the set
		 * If after the second LL is completely traversed and since no common attribute is found
		 * that means no intersection is there
		 */

		 HashSet<LinkedListNode> set = new HashSet<>();
		 while(firstHead != null){
			set.add(firstHead);
			firstHead = firstHead.next;
		 }

		 while(secondHead != null){
			if(set.contains(secondHead))
				return secondHead;
			secondHead = secondHead.next;
		 }

		 return -1;

	}
}
