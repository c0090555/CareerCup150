
public class deleteNode {
	public static boolean delNode(LinkedListNode n){
		if(n == null || n.next == null) return false;
		
		LinkedListNode tmp = n.next;
		n.data = tmp.data;
		n = tmp;
		return true;
	}

}
