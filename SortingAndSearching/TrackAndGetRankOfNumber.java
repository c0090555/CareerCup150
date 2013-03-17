package SortingAndSearching;

public class TrackAndGetRankOfNumber {
	private static RankNode root = null;
	
	public static void track(int number){
		if(root == null){
			root = new RankNode(number);
		}
		else root.insert(number);
	}
	
	public static int getRankOfNumber(int number){
		return root.getRank(number);
	}
	
	
	
	
	
}
class RankNode{
	public int data;
	RankNode left, right;
	int left_size = 0;
	public RankNode root = null;
	
	RankNode(int d){
		data = d;
	}
	
	
	public void insert(int number){
		if(number <= data){
			if(left != null) left.insert(number);
			else left = new RankNode(number);
			left_size++;
		}
		else{
			if(right != null) right.insert(number);
			else right = new RankNode(number);
		}												
	}
	
	public int getRank(int d){
		if(d == data){
			return left_size;
		}
		else if(d < data){
			if(left == null) return -1;
			else return left.getRank(d);
		}
		else{
			if(right == null) return -1;
			else{
				int right_rank = right.getRank(d);
				if(right_rank == -1) return -1;
				else return left_size + 1 + right_rank;
			}
		}
		
	}
	
	
	
	
	
}
