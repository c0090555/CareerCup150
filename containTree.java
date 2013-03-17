package TreesAndGraphs;

public class containTree {
	public static boolean contain(TreeNode t1, TreeNode t2){
		if(t2 == null) return true; //empty tree is always a subtree
		else return subTree(t1, t2);
	}
	
	public static boolean subTree(TreeNode t1, TreeNode t2){
		if(t1 == null) return false; //big tree empty
		if(t1.data == t2.data) 
			if(matchTree(t1, t2)) return true;
		return subTree(t1.left, t2) || subTree(t1.right, t2);
	}
	
	public static boolean matchTree(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null) return true; //nothing left in the subtree
		if(t1 == null ||t2 == null) return false; //big tree empty & subtree not found
		if(t1.data != t2.data) return false; 
		
		return (matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right));
		
	}
}
