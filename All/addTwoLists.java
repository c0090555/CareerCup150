
public class addTwoLists {
	public static LinkedListNode addLists(LinkedListNode n1, LinkedListNode n2, int carry){ //write this methd via recursion
		if(n1 == null | n2 == null) return null;
		
		LinkedListNode result = new LinkedListNode(carry, null, null);
		int value = carry;
		
		value += n1.intdata;
		value += n2.intdata;
		
		result.intdata = value % 10;
		LinkedListNode more = addLists(n1 == null ? null : n1.next, n2 == null ? null : n2.next, value > 10 ? 1 : 0);
		more.setNext(more);
		
		return result;
	}
		
	
}
