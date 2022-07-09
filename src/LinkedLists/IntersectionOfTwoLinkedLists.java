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
	//^ Utility method to find the difference in the length of two LLs
	static int findDifference(LinkedListNode head1, LinkedListNode head2)
	{
		int l1 = 0, l2 = 0;
		// TC: O(Max(L1, L2))
		while(head1 != null || head2 != null){
			if(head1 != null){
				l1++;
				head1 = head1.next;
			}
			if(head2 != null){
				l2++;
				head2 = head2.next;
			}
		}

		return l1 - l2;
	}
	public static int findIntersectionThree(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead)
	{
		//& Difference of length method
		//& Find the difference in the length of both the LLs
		//& If difference is positive, say d, then move head1 by d steps ahead
		//& If difference is negative, meaning second LL is longer, move head2 by d steps ahead
		//& This is reducing the iteration time complexity by d steps
		int d = findDifference(firstHead, secondHead);
		if(d > 0){
			while(d-- != 0)
				firstHead = firstHead.next;
		}

		else if( d < 0){
			while(d++ != 0){
				secondHead = secondHead.next;
			}
		}

		while(firstHead != null){
			if(firstHead == secondHead)
				return firstHead.data;
			firstHead = firstHead.next;
			secondHead = secondHead.next;
		}

		return firstHead.data;
	}


	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead)
	{
		Node d1 = firstHead;
		Node d2 = secondHead;
		
		while(d1 != d2) {
			//d1 == null -- Condition inside if clause
			// do the thing before : if the condition is true, else after the :
			d1 = d1 == null? secondHead:d1.next;
			d2 = d2 == null? firstHead:d2.next;
		}
		
		return d1
	}
}
