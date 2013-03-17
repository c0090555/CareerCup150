package TreesAndGraphs;


public class InorderSucc {
	public static TreeNode InSucc(TreeNode e){
		if(e != null){
			TreeNode p;
			if(e.parent == null || e.right != null){
				p = leftMostChildren(e.right);
			}
			else{
				while((p = e.parent) != null){
					if(p.left == e)
						break;
					e = p;
				}
			}
		return p;
		}
		return null;
		
	}

	public static TreeNode leftMostChildren(TreeNode e){
		if(e == null) return null;
		while(e.left != null)
			e = e.left;
		return e;
	}
}


	



