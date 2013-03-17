package BitManipulation;

public class bitSwapRequired {
	public static int countBits(int a, int b){
		int count = 0;
		for(int c = a ^ b; c != 0; c >>= 1){
			count += c & 1;
		}
		return count;
	}
	public static void main(String[] args){
		int a = 2; int b = 6;
		System.out.println(countBits(a, b));
	}
}
