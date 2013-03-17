package Moderate;

public class magicGetMax {
	
	/*flips a 1 to 0 and a 0 to 1*/ 
	public static int flip(int bit){
		return 1^bit;
	}
	
	
	/*returns 1 if number>=0, otherwise returns 0*/
	public static int sign(int number){
		return flip((number>>31) & 0x1);
	}
	
	
	public static int getMax(int a, int b){
		int signa = sign(a);
		int signb = sign(b);
		int c = a - b;
		int signc = sign(c);
		int k, q;
		
		//check whether a and b have same sign
		int use_signa = signa ^ signb;
		int use_signc = flip(use_signa);
		
		k = use_signa * signa + use_signc * signc;
		//System.out.println(signc);
		q = flip(k);
		//System.out.println("k " + k + " q " + q);
		
		return (k * a + q * b);		
	}
	
	public static void main(String[] args){
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		System.out.println(getMax(a,b));
		//System.out.println(Integer.MAX_VALUE);
	}

}
