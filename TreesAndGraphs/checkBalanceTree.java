package TreesAndGraphs;

public class checkBalanceTree {
	public static int maxDepth(TreeNode root){
		if(root == null) return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public static int minDepth(TreeNode root){
		if(root == null) return 0;
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}
	
	public boolean isBalance(TreeNode root){
		return (maxDepth(root) - minDepth(root) <= 1);
	}
}

class TreeNode{
	TreeNode(int v){
		value = v;
	}
	
	public int data;
	private int value;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
}
