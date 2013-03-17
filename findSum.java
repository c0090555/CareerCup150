package TreesAndGraphs;

import java.util.ArrayList;

public class findSum {
	public static void find(TreeNode head, int sum, ArrayList<Integer> buffer, int level){
		if(head == null) return;
		int tmp = sum;
		buffer.add(head.data);
		for(int i = level; i >= 0; i++){
			tmp -= buffer.get(i);
			if(tmp == 0)
				print(buffer, i, level);
		}
		
		ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone();
		ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone();
		
		find(head.left, sum, c1, level + 1);
		find(head.right, sum, c2, level + 1);
	}
	
	public static void print(ArrayList<Integer> buffer, int i1, int i2){
		for(int i = i1; i <= i2; i++){
			System.out.println(" " + buffer.get(i));
		}
		System.out.println();
	}
	
	
	
}
