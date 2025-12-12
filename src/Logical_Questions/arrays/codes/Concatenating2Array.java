package arrays.codes;

public class Concatenating2Array {

	public static void main(String[] args) {
		int arr1[] = { 6, 7, 8, 9, 10 };
		int arr2[] = { 1, 2, 3, 4, 5 };
		int conCatArray[]=new int[arr1.length+arr2.length];

		int i=0,j=0,k=0;
		while(i<arr1.length) {
			conCatArray[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			conCatArray[k]=arr2[j];
			j++;
			k++;
		}
		for(int a:conCatArray) {
			System.out.print(a+" ");
		}
		
	}

}
