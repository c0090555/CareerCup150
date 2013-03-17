package TreesAndGraphs;

public class createMinimalBST {
	public static TreeNode addToTree(int[] array, int start, int end){
		if(end < start) return null;
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(array[mid]);
		n.left = addToTree(array, start, mid - 1);
		n.right = addToTree(array, mid + 1, end);
		return n;
	}
	
	public static TreeNode createMinBST(int[] array){
		return addToTree(array, 0, array.length - 1);
	}
	

}
