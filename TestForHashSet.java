package Test;
import java.util.*;

import org.jivesoftware.util.LinkedListNode;


public class TestForHashSet {
	int a = 1;
	
	int count(){
		return 1;
	}
		public static void main(String[] args){
			String i = "2";
			LinkedListNode n = new LinkedListNode(i,null,null);
			
			Set<Integer> set = new HashSet<Integer>();
			Integer i1 = 22;
			Integer i2 = 45;
			boolean a = set.add(i1);
			System.out.print(a + "1 ");
			boolean b = set.add(i1);
			System.out.print(b + "2 ");
			boolean c = set.add(i2);
			System.out.print(c + "3 ");
			System.out.print(set.size() + " ");
			boolean d = set.remove(i1);
			System.out.print(d + "4 ");
			System.out.print(set.size() + " ");
			i2 = 47;
			boolean f = set.contains(i2);
			System.out.print(f + "5 ");
			boolean e = set.remove(i2);
			System.out.print(e + "4 ");
			System.out.print(set.size() + " ");
		}
		
		
	
}
