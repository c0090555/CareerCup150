import java.util.*;

class LinkedListNode{
	public LinkedListNode prev;
	public LinkedListNode next;
	public Object data;
	
	public int intdata;
	
	public LinkedListNode(Object data, LinkedListNode prev, LinkedListNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	
	public void remove(){
		prev.next = next;
		next.prev = prev;
	}
	
	public String toString(){
		return data.toString();
	}
	
	public void setNext(LinkedListNode n){
		this.next = n;
	}
}


public class DeleteDuplicatsFromLinkedList {
	public static void DeleteDups(LinkedListNode n){
		Hashtable table = new Hashtable();
		//LinkedListNode previous = null;
		
		while(n != null){
			if(table.containsKey(n.data)){
				n.prev.next = n.next;
				n.next.prev = n.prev;
			}
			else{
				table.put(n.data, true);
			}
			
			n = n.next;
		}
		
	}
	
	public static void main(String[] args){
		
		LinkedListNode a = null;
		String s1 = "12321312412";
		//LinkedListNode a2 ;
		LinkedListNode a1 = new LinkedListNode(s1, a, a2);
		
		String s2 = "gygug12412";
		LinkedListNode a3 = null;
		LinkedListNode a2 = new LinkedListNode(s2, a1, a3);
		
	}
	
}
