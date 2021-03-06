package TreesAndGraphs;

public class commonAncestor2 {
	static int TWO_NODES_FOUND = 2;
	static int ONE_NODE_FOUND = 1;
	static int NO_NODES_FOUND = 0;
	
	//Check how many "special" nodes are located under this root
	public static int covers(TreeNode root, TreeNode p, TreeNode q){
		int ret = NO_NODES_FOUND;
		if(root == null) return ret;
		if(root == p || root == q)
			ret += 1;
		ret += covers(root.left, p, q);
		if(ret == TWO_NODES_FOUND) return ret;
		return ret += covers(root.right, p, q);
	}
	
	public TreeNode common(TreeNode root, TreeNode p, TreeNode q){
		if((p ==q) &&(root.left == p || root.right == p)) return root;
		int nodesFromLeft = covers(root.left, p, q);
		if(nodesFromLeft == TWO_NODES_FOUND){
			if(root.left == p || root.left == q) return root.left;
			else return common(root.left, p, q);
		}
		else if(nodesFromLeft == ONE_NODE_FOUND){
			if(root == p) return p;
			else if(root == q) return q;	
		}
				
		int nodesFromRight = covers(root.right, p, q);
		if(nodesFromRight == TWO_NODES_FOUND){
			if(root.right == p || root.right == q) return root.right;
			else return common(root.right, p, q);
		}
		else if(nodesFromRight == ONE_NODE_FOUND){
			if(root == p) return p;
			else if(root == q) return q;
		}
		
		if(nodesFromLeft == ONE_NODE_FOUND && nodesFromRight == ONE_NODE_FOUND)
			return root;
		else return null;		
	}	
}
 