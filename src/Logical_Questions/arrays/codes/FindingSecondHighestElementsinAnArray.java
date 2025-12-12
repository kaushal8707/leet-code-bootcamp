package arrays.codes;
//always first element we need to take as a min and max then we need to scan with 2nd elements

public class FindingSecondHighestElementsinAnArray {

	public static void main(String[] args) {
		int arr[]= {5,8,3,9,6,2,10,7,-1,4};
		int max=arr[0]; //5
		int second_max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				second_max=max;
				max=arr[i];
			}else if(arr[i]>second_max) {
				second_max=arr[i];
			}
		}
		
		System.out.println("Max = "+max);
		System.out.println("Second max  = "+second_max);

	}

}
