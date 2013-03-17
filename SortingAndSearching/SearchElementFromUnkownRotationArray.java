package SortingAndSearching;

public class SearchElementFromUnkownRotationArray {
	public int search(int[] a, int left, int right, int x){
		int mid = (left + right) / 2;
		if(a[mid] == x){
			return mid;
		}
		if(left > right){
			return -1;
		}
		
		
		if(a[left] < a[mid]){ //left side in ascending sequence
			if(x >= a[left] && x <= a[mid]){
				return search(a, left, mid - 1, x);
			}
			else{
				return search(a, mid + 1, right, x);
			}
		}
		else if(a[mid] < a[left]){ //right side in ascending sequence
			if(x >= a[mid] && x <= a[right]){
				return search(a, mid + 1, right, x);
			}
			else{
				return search(a, left, mid - 1, x);
			}
		}
		else if(a[mid] == a[left]){ //all numbers from left half are the same(a[left]) 
			
				return  search(a, mid + 1, right, x);
			
		}
		return -1;
		
	}
	
}
