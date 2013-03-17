package TreesAndGraphs;

import java.util.LinkedList;
import java.util.ArrayList;


public class findLevelLinkedList {
	public ArrayList<LinkedList<TreeNode>> findLevel(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		int level = 0;
		if(root == null) return null;
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		list.add(root);
		result.add(0, list);
		
		while(true){
			list = new LinkedList<TreeNode>();
			for(int i = 0; i < result.get(level).size(); i++){
				TreeNode n = result.get(level).get(i);
				if(n != null){
					if(n.left != null) list.add(n.left); 
					if(n.right != null) list.add(n.right);
				}
				
			}
			
			if(list.size() > 0)
				result.add(level + 1, list);
			else
				break;
			
			level++;
		}	
		
		return result;
	}
}
