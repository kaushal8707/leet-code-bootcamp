package arrays.codes;

public class ReversingAnArray {

	public static void main(String[] args) {
		int arr[]= {5,2,9,3,6,4,1,8,7};
		int revArr[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			revArr[j]=arr[i];
			j++;
		}
		for(int m:revArr) {
			System.out.print(m+" ");
		}

	}

}
