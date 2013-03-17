package ArraysAndStrings;

public class checkTwoNumsSumToAConstant {
	
	
	public static boolean check(int[] a, final int c){
		int size = a.length;
		int i = 0;
		int j = size - 1;
		int t = 0;
		while(i <= j){
			if(a[i] + a [j] == c){
				System.out.println(a[i] + " " + a[j]);
				t =1;
				i++;
			}
			if(a[i] + a[j] < c){
				i++;
			}
			if(a[i] + a[j] > c){
				j--;
			}
		}
		if(t == 1) return true;
		return false;
		
	}
   
	public static int maxSubSum3(int[] a){
		int maxSum = 0;
		int thisSum = 0;
		int seqStart = 0;
		int seqEnd = -1;
	
		for(int from = 0, to = 0; to < a.length; to ++){
			thisSum += a[to];
			if(thisSum > maxSum){
				maxSum = thisSum;
				seqStart = from;
				seqEnd = to;
				
			}
			else if(thisSum < 0){
				from = to + 1;
				thisSum = 0;
			}
			
		}
			return maxSum;
	}
		

	
	
	
	
	public static void main(String[] args){
		int[] a = {1,2,-5};
	
	System.out.println(maxSubSum3(a));
	}
	
	
	
} 
