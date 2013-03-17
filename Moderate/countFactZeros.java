package Moderate;

public class countFactZeros {
	public static int count(int num){
		int c = 0;
		for(int i = 5; num / i > 0; i *= 5){
			System.out.println(" " + num / i);
			c += num / i;
		}
		return c;
	}
	
	public static void main(String[] args){
		int n = 26;
		System.out.println(count(n));
	}
	
}
