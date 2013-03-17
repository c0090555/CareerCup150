
public class deleteDupsWithoutBuffer {
	public static void deleteDup2(LinkedListNode head){
		if(head == null) return;
		LinkedListNode previous = head;
		LinkedListNode current = head.next;
		
		while(current != null){
			LinkedListNode runner = head;
			while(runner != current){
				if(runner.data == current.data){
					LinkedListNode tmp = current.next;
					previous.next =tmp;
					current = tmp;
					break;	
				}
				runner = runner.next;						
			}
			
		if(runner == current){
			previous = current;
			current = current.next;
		}
			
		}
		
	}

}
