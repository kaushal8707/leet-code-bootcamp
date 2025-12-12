package arrays.codes;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 5};
		//int arr[] = { 1, 2, 3, 4, 5, 4, 5, 6, 5, 6, 7, 8 };

		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				arr[i+1]=0;
			}
		}
		for(int a:arr) {
			if(a!=0) {
				System.out.print(a+" ");
			}
		}
		
	}
}
