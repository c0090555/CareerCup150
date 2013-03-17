package TreesAndGraphs;

public class commonAncestor {
	public static TreeNode common(TreeNode root, TreeNode p, TreeNode q){
		if(root == null || p == null || q == null)
			return null;
		if(covers(root.left, p) && covers(root.left, q))
			common(root.left, p, q);
		if(covers(root.right, p) && covers(root.right, q))
			common(root.right, p, q);
		return root;
		
	}
	
	public static boolean covers(TreeNode root, TreeNode p){
		if(root == null) return false;
		if(root == p) return true;
		return covers(root.left, p) || covers(root.right, p);
	}
	
}
