
public class findBeginning {
	public static LinkedListNode findBeg(LinkedListNode head){
		if(head == null) return null;
		
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1 == p2)
				break;
		}
		
		if(p2.next == null)
			return null;
		
		p1 = head;
		while(p1 != p2){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
		
	}
}
