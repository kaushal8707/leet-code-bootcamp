package arrays.codes;

public class FindingDuplicatesInSortedArray {

	public static void main(String[] args) {
		int arr[]= {3,6,8,8,10,12,15,15,15,20};
		int lastDuplicate=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1] && lastDuplicate!=arr[i]) {
				System.out.print(arr[i]+" ");
				lastDuplicate=arr[i];
			}
		}
	}
}
