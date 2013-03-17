package BitManipulation;

public class updateBits {
	public static int update(int n, int m, int i, int j){
		int max = ~0;
		int left = max - ((1 << j) - 1);
		int right = (1 << i) - 1;
		int mask = left | right;
		return (n & mask) | (m << i);
	}
	 public static void main(String[] args){
		 int n = 1;
		 int m = 5;
		 int i = 2;
		 int j = 4;
		 System.out.println(update(n, m, i, j));
	 }
	
	
}
  