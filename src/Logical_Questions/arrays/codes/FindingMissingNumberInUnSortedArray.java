package arrays.codes;

public class FindingMissingNumberInUnSortedArray {

	public static void main(String[] args) {
		int A[]= {3,7,4,9,6,1,11,2,10};
		int lowest_In_Array=1;
		int highest_In_Array=12;   // i need to create a new array with with index with highest number
		int n=A.length;
		int newArr[]=new int[highest_In_Array];
		
		for(int i=0;i<A.length;i++) {
			newArr[A[i]]++;
		}
		for(int j=lowest_In_Array;j<=newArr.length;j++) {
			if(newArr[j]==0) {
				System.out.print(j+" ");
			}
		}
		
		
	}
}
