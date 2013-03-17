
//Check wheteFind a pair of numbers in an array whose sum is a specific value x 
public class FindPairsSumInSpecificValue {
	
	public static boolean checkArray(int[] a, int start, int end, int x){
		if(start >= end)
			return false;
		if(a[start] + a[end] == x){
			return true;
		}
		if(a[start] + a[end] < x){
			return (checkArray(a, start + 1, end, x));		
		}
		if(a[start] + a[end] > x){
			return (checkArray(a, start, end - 1, x));
		}
		
		
		return false;
	}
	
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7};
		int start = 0;
		int end = a.length - 1;
		int x = 2000;
		System.out.println(end);
		System.out.println(checkArray(a, start, end, x));
		
	}
	


}