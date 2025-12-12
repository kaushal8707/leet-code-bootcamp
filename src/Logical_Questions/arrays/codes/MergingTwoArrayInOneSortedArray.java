package arrays.codes;

public class MergingTwoArrayInOneSortedArray {
	public static void main(String[] args) {
		int A[]= {1,3,5,7,9};
		int B[]= {2,4,6,8,12};
		int sortedArray[]=new int[A.length+B.length];
		 int i=0;
		 int j=0;
		 int k=0;
		 while(i<A.length && j<B.length) {
			 if(A[i]<B[j]) {
				 sortedArray[k]=A[i];
				 i++;
				 k++;
			 }else {
				 sortedArray[k]=B[j];
				 j++;
				 k++;
			 }
		 }
		 while(i<A.length) {
			 sortedArray[k]=A[i];
			 i++;
			 k++;
		 }
		 while(j<B.length) {
			 sortedArray[k]=B[j];
			 j++;
			 k++;
		 }
		 
		 for(int d : sortedArray) {
			 System.out.print(d+" ");
		 }
	}
}
