package BitManipulation;

public class swapOddEvenBits {
	public static int swap(int a){
		return ((a & 0xaaaaaaaa)>>1 | (a & 0x55555555)<<1);
	}
	
	public static void main(String[] args){
		int a = 1;
		System.out.println(swap(a));
	}
}
