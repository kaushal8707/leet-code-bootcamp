package arrays.codes;

public class FindingSingleMissingNumberInSortedArray {

	public static void main(String[] args) {
		
		//Way -1   Using Sum of N natural Number
		int arr[]= {1,2,3,4,5,6,8,9,10,11,12};
		int n=12;
		int s=0;
		
		int sum = (n*(n+1))/2;  //sum of 12 natural number
		for(int i=0;i<arr.length;i++) {
			s=s+arr[i];
		}
		int missingNumber = (sum - s);
		System.out.println("Missing Number is : "+missingNumber);
		
		
		//Way - 2 Using Indices if number not start from 1 ( indexes starts from 0,1,2,3,4,5........)
		
		//so the difference of number - index should be equal
		//(6-0),(7-1),(8-2),(9-3),(10-4),(11-5)......all should be 6
		
		int arr1[]= {6,7,8,9,10,11,13,9,14,15,16,17};
		int l=arr1[0];
		int diff=l-0;
		for(int i=0;i<arr1.length;i++) {
			if((arr1[i]-i)!=diff) {
				System.out.println("Missing Number is  "+(i+diff));
				break;
			}
		}
		

		
	}
}
