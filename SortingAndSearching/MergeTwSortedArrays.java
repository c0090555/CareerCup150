package SortingAndSearching;


public class MergeTwSortedArrays {
	public void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA - 1; 
		int indexB = lastB - 1;
		int indexMerge = lastA + lastB - 1;
		
		while(indexA >= 0 && indexB >= 0){
			if(a[indexA] > a[indexB]){
				a[indexMerge] = a[indexA];
				indexA--;
				indexMerge--;
			}
			else{
				a[indexMerge] = b[indexB];
				indexB--;
				indexMerge--;
			}
		}
		
		
		while(indexB >= 0){
			a[indexMerge] = b[indexB];
			indexB--;
		}
	}
}
