package SortingAndSearching;

public class FindStringFromSortedArrayWithEmptyString {
	public int search(String[] a, String str, int first, int end){
		int mid = (first + end) / 2;
		if(a[mid] == str){
			return mid;
		}
		if(first > end){
			return -1;
		}

		if(a[mid].isEmpty()){
			int left = mid - 1;
			int right = mid + 1;
			while(true){
				if(left < first && right > end) return -1; //cannot find a non-empty middle string 
				if(left >= first && !a[left].isEmpty()){
					mid = left;
					break;
				}
				if(right <= end && !a[right].isEmpty()){
					mid = right;
					break;
				}
				left--;
				right++;
			}						
		}
		
		if(str.compareTo(a[mid]) < 0){
			return search(a, str, first, mid - 1);
		}
		else return search(a, str, mid + 1, end);
		
	}
	
	public int search(String[] a, String str){
		if(a == null || str == null || str ==""){
			return -1;
		}
		
		
		return search(a, str, 0, a.length - 1);
	}
	
}
